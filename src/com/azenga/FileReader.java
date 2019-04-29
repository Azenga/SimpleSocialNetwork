package com.azenga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
	
	public static List<Profile> profileList = new ArrayList<Profile>();

	public FileReader() {
	}

	private static void populateProfileList(String fileName) {

		BufferedReader reader = getReader(fileName);
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				createProfile(line);
			}
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}

	}

	private static BufferedReader getReader(String fileName) {
		File file = new File(fileName);

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new java.io.FileReader(file));
		} catch (FileNotFoundException e) {
			System.err.println(e.getLocalizedMessage());
		}

		return reader;
	}

	private static void createProfile(String line) {

		String[] fields = line.split(",");

		String firstName = fields[0].trim();
		String lastName = fields[1].trim();
		int day = Integer.parseInt(fields[2].trim());
		int month = Integer.parseInt(fields[3].trim());
		int year = Integer.parseInt(fields[4].trim());
		String town = fields[5].trim();
		String country = fields[6].trim();
		String nationality = fields[7].trim();
		String email = fields[8].trim();
		String[] interests = fields[9].trim().split(";");

		Profile profile = new Profile(firstName, lastName, day, month, year, town, country, nationality, email,
				interests);

		profileList.add(profile);

	}
	
	public static BST readProfileSet (String filename) {

		populateProfileList(filename);
		
		BST bst = new BST();
		
		for(Profile profile: profileList) {
			bst.insertProfile(profile);
		}
		
		return bst;
	}

}
