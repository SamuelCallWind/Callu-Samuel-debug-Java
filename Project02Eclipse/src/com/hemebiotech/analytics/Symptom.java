package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/*
 * The Symptom class is made so that when calling each method
 * 
 */
public class Symptom {

    private static HashMap<String, Integer> symptoms = new HashMap<>();

    public static void addSymptom(String name) {

    	/*
    	 * If the symptom is already present in the hashmap, just increment it by 1
    	 * Else, create a new symptom in the hashmap and insert it's value to 1
    	 */
        if (symptoms.containsKey(name)) {
            symptoms.put(name, symptoms.get(name) + 1);
        } else {
            symptoms.put(name, 1);
        }
    }

    public static void writeTotalSymptoms() throws IOException {
    	/*
    	 * This method is reading the full hashmap "symptoms", and write it's content in the result.out file
    	 */

        FileWriter writer = new FileWriter ("result.out");
        
        for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        writer.close();
        System.out.println("The symptoms were added into the file result.out");
    }

}
