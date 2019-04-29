package com.azenga;

public class BST {
	
	private BSTNode root;
	
	/*
	 * Inserts a profile to the existing network according to the alphabetical order
	 * 
	 */

	public BST() {
	}

	public void insertProfile(Profile profile) {
		root = addProfile(root, profile);
	}
	
	public BSTNode addProfile(BSTNode node, Profile profile) {
		if(node == null) {
			node = new BSTNode(profile);
			return node;
		}
		
		//Compares the name of the profile in the current node with new node and puts the new node in appropriate position
		
		if(profile.getName().compareTo(node.getProfile().getName()) < 0) {
			node.setL(addProfile(node.getL(), profile));
		}else if(profile.getName().compareTo(node.getProfile().getName()) > 0){
			node.setR(addProfile(node.getR(), profile));
		}
		
		return node;
	}
	
	// The method to print the sorted list
	public void printAlphabetically() {
		inOrderRec(root);
	}

	private void inOrderRec(BSTNode node) {
		//Print the item to the left and right of the node
		if(node != null) {
			inOrderRec(node.getL());
			System.out.println(node.getProfile());
			inOrderRec(node.getR());
		}
		
	}
}
