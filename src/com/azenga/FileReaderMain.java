package com.azenga;

public class FileReaderMain {

	public static final String FILE_NAME = "subscribers.txt";

	public static void main(String[] args) {
		BST bst = FileReader.readProfileSet(FILE_NAME);
		
		bst.inOrder();
	}
}