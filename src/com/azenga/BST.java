package com.azenga;

public class BST {
	private BSTNode root;

	public BST() {
	}

	public void insertProfile(Profile profile) {
		BSTNode temp = new BSTNode(profile);
		
		if(root == null) {
			root = temp;
		}
	}
}
