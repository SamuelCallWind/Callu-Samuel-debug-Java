package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String filePath;
	
	WriteSymptomDataToFile(String filePath) {
		this.filePath = filePath;
	}
	
	
	public void writeSymptoms(Map<String, Integer> symptoms) {
		if (symptoms.isEmpty() || symptoms == null) {
			System.out.println("No symptoms to write.");
			return;
		}
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			for (Map.Entry<String, Integer> element : symptoms.entrySet()) {
				fileWriter.write(element.getKey() + ": " + element.getValue() + "\n");
			}
			System.out.println("The symptoms have been written in the result.out file");
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("Error while writing the file: " + e.getMessage());
		}
	}
	
}
