package com.azenga;

public class BSTNode {
	
	private Profile data;
	private BSTNode l,r;
	
	public BSTNode(Profile data){
		this.data = data;
	}
	
	public Profile getProfile() {
		return this.data;
	}
	
	public void setL(BSTNode l) {
		this.l = l;
	}
	
	
	public void setR(BSTNode r) {
		this.r = r;
	}

	public BSTNode getL() {
		return l;
	}

	public BSTNode getR() {
		return r;
	}

}

//I is exactly as instructed in the pdf question
/*
 * Contains a node and link to its right and left nodes 
 * Used for sorting the profile in alphabetical order
 * 
 * 
 */
