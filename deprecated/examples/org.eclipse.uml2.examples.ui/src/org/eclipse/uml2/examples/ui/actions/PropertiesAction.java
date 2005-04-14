/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: PropertiesAction.java,v 1.1 2005/04/14 17:32:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.util.UML2Resource;

/**
 * 
 */
public abstract class PropertiesAction
		extends UML2CommandAction {

	protected static final String PROPERTIES_SEPARATOR = " = "; //$NON-NLS-1$

	protected static boolean isEmpty(String string) {
		return null == string || 0 == string.length();
	}

	protected static String format(String name, String separator,
			String prefix, boolean includePrefix) {

		List parsedName = new ArrayList();

		if (prefix != null) {

			if (name.startsWith(prefix)) {
				name = name.substring(prefix.length());
			}

			if (includePrefix) {
				parsedName = parseName(prefix, '_');
			}
		}

		if (name.length() != 0) {
			parsedName.addAll(parseName(name, '_'));
		}

		StringBuffer result = new StringBuffer();

		for (Iterator nameIter = parsedName.iterator(); nameIter.hasNext();) {
			String nameComponent = (String) nameIter.next();

			result.append(result.length() == 0
				? nameComponent
				: capName(nameComponent));

			if (nameIter.hasNext() && nameComponent.length() > 1) {
				result.append(separator);
			}
		}

		return result.length() == 0 && prefix != null
			? prefix
			: result.toString();
	}

	protected static List parseName(String sourceName, char sourceSeparator) {
		List result = new ArrayList();
		StringBuffer currentWord = new StringBuffer();

		int length = sourceName.length();
		boolean lastIsLower = false;

		for (int index = 0; index < length; index++) {
			char curChar = sourceName.charAt(index);

			if (Character.isUpperCase(curChar)
				|| (!lastIsLower && Character.isDigit(curChar))
				|| curChar == sourceSeparator) {

				if (lastIsLower || curChar == sourceSeparator) {
					result.add(currentWord.toString());
					currentWord = new StringBuffer();
				}

				lastIsLower = false;
			} else {

				if (!lastIsLower) {
					int currentWordLength = currentWord.length();

					if (currentWordLength > 1) {
						char lastChar = currentWord.charAt(--currentWordLength);
						currentWord.setLength(currentWordLength);

						result.add(currentWord.toString());

						currentWord = new StringBuffer();
						currentWord.append(lastChar);
					}
				}

				lastIsLower = true;
			}

			if (curChar != sourceSeparator) {
				currentWord.append(curChar);
			}
		}

		result.add(currentWord.toString());

		return result;
	}

	protected static String capName(String name) {
		return name.length() == 0
			? name
			: (name.substring(0, 1).toUpperCase() + name.substring(1));
	}

	protected static StringBuffer appendValidIdentifier(
			StringBuffer validIdentifier, String name) {

		if (!isEmpty(name)) {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validIdentifier.append(char_0);
			} else {
				validIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); ++i) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validIdentifier.append(char_i);
				}
			}
		}

		return validIdentifier;
	}

	protected static String getValidIdentifier(String name) {
		return appendValidIdentifier(new StringBuffer(), name).toString();
	}

	protected static String getPropertiesKey(String prefix, String string) {
		return prefix + getValidIdentifier(string.replace(':', '_'));
	}

	protected static PrintWriter getPropertiesWriter(
			org.eclipse.uml2.Package package_) {

		Resource resource = package_.eResource();
		ResourceSet resourceSet = resource.getResourceSet();

		URI uri = resource.getURI().trimFileExtension().appendFileExtension(
			UML2Resource.PROPERTIES_FILE_EXTENSION);

		List properties = new ArrayList();

		LineNumberReader lineNumberReader = null;

		try {
			lineNumberReader = new LineNumberReader(new InputStreamReader(
				resourceSet.getURIConverter().createInputStream(uri)));

			for (String line = lineNumberReader.readLine(); null != line; line = lineNumberReader
				.readLine()) {

				properties.add(line);
			}
		} catch (Exception e) {
			// ignore
		} finally {

			try {

				if (null != lineNumberReader) {
					lineNumberReader.close();
				}
			} catch (IOException ioe) {
				// ignore
			}
		}

		PrintWriter printWriter = null;

		try {
			printWriter = new PrintWriter(resourceSet.getURIConverter()
				.createOutputStream(uri), true);

			if (!properties.isEmpty()) {

				for (Iterator i = properties.iterator(); i.hasNext();) {
					printWriter.println((String) i.next());
				}

				printWriter.println();
			}
		} catch (IOException ioe) {
			// ignore
		}

		return printWriter;
	}
}
