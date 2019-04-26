package com.azenga;

public class BST {
	
	private BSTNode root;

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
		
		if(profile.getName().compareTo(node.getProfile().getName()) < 0) {
			node.setL(addProfile(node.getL(), profile));
		}else if(profile.getName().compareTo(node.getProfile().getName()) > 0){
			node.setR(addProfile(node.getR(), profile));
		}
		
		return node;
	}
	
	
	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(BSTNode node) {
		
		if(node != null) {
			inOrderRec(node.getL());
			System.out.println(node.getProfile());
			inOrderRec(node.getR());
		}
		
	}
}
