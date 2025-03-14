package com.hemebiotech.analytics;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;



/*
 * Implementation of a  AnalyticsCounter that is reading symptoms from the symptom file.
 *  This class is reading each line of the document and writes them back in the result.out file
 * For that, another class Symptom is created where both static methods are used
 */


public class AnalyticsCounter {	// initialize to 0

	public static void main(String args[]) throws Exception {
		/*
		 * Creating the reader to open and read the symptom file and scanning each line
		 */

		ReadSymptomDataFromFile newRead = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile newWrite = new WriteSymptomDataToFile("result.out");
		
		newWrite.writeSymptoms(newRead.GetSymptoms());
		
		
		//WriteSymptomDataToFile newWrite = new WriteSymptomDataToFile("result.out");
		//newWrite.writeSymptoms(newRead.GetSymptoms());;
	}
}




// counts headaches

// Deleted the useless i incrementation as it was not used for anything.
//Changed the incrementation of headacheCount instead of the headache variable 

//There was a typo at the "rash". It was written "rush" instead. So that is why the result were not printed correctly