package com.azenga;

public class FileReaderMain {

	public static final String FILE_NAME = "subscribers.txt";

	public static void main(String[] args) {
		
		BST bst = FileReader.readProfileSet(FILE_NAME);
		
		System.out.println("\tNOT in Alphabetical order\n============================================");
		
		int count = 0;
		for (Profile profile : FileReader.profileList) {
			System.out.println(++count + ") " + profile);
		}
	}
}
