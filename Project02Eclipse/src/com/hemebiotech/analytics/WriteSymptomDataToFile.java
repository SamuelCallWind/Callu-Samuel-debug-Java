package com.hemebiotech.analytics;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * This class Implements the ISymptomWriter Interface and write the symptoms
 * in the filepath provided in the WriteSymptomDataToFile Method
 */
public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String filePath;
	
	WriteSymptomDataToFile(String filePath) {
		this.filePath = filePath;
	}
	
	/**
	 * If the Map of symptom provided is empty, end the program
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) {
		if (symptoms.isEmpty() || symptoms == null) {
			System.out.println("No symptoms to write.");
			return;
		}
		
		/**
		 * For each key of the Map, retrieve it's value before concatenating it 
		 * and adding the line to the file.
		 * Finishing with \n to create a new string for each symptom.
		 */
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			for (Map.Entry<String, Integer> element : symptoms.entrySet()) {
				fileWriter.write(element.getKey() + ": " + element.getValue() + "\n");
			}
			System.out.println("The symptoms have been written in the " + filePath +" file");
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("Error while writing the file: " + e.getMessage());
		}
	}
	
}
