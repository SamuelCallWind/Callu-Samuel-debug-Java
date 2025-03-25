package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class will read the data from the file path mentioned 
 * and create a HashMap with the value of each symptom
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	@Override
	/*
	 * This method will create a new HashMap and put each new word in it. 
	 * If the world is already in there, the value of this new word will be incremented by 1.
	 */
	public Map<String, Integer> getSymptoms() {
		Map<String, Integer> result = new TreeMap<String, Integer>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.put(line, result.getOrDefault(line, 0) + 1);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
