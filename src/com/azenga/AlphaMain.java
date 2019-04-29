package com.azenga;

public class AlphaMain {
	//The filename that contains the edges/connecttions between the friends
	public static final String FILE_NAME = "subscribers.txt";

	public static void main(String[] args) {
		//Creating a bst instance from a file containing details of there profile
		BST bst = FileReader.readProfileSet(FILE_NAME);
		
		System.out.println("\tAlphabetically Ordered Subscribers\n============================================");
		bst.printAlphabetically();
	}
}
