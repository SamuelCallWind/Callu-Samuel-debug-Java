package com.hemebiotech.analytics;

import java.util.Map;

/*
 * This is an interface defining a method that writes the symptoms and occurrences to a file
 */

public interface ISymptomWriter {
	
	void writeSymptoms(Map<String, Integer> symptoms);

}
