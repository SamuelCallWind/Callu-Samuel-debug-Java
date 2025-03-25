package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
/**
 * Implementation of a  AnalyticsCounter that is reading symptoms from the symptom file.
 *  This class is reading each line of the document and writes them back in the result.out file
 * For that, another class Symptom is created where both static methods are used
 */
public class AnalyticsCounter {	// initialize to 0
	public static void main(String args[]) throws Exception {
		/**
		 * Creating the reader to open and read the symptom file and scanning each line
		 */
		ReadSymptomDataFromFile newRead = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile newWrite = new WriteSymptomDataToFile("result.out.ordered");
		
		newWrite.writeSymptoms(newRead.getSymptoms());
	}
}

