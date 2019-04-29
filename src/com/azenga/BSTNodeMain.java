package com.azenga;

public class BSTNodeMain {
	public static void main(String[] args) {
		Profile kevinProfile = new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com", new String[] {"Programming", "Helping"});
		Profile maggyProfile = new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan", "cellnmagy4@gmail.com", new String[] {"Travelling", "Sleeping"});
		Profile cateProfile = new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan", "catherine001@gmail.com", new String[] {"Data Analysis", "Sleeping"});
		
		BSTNode nodeOne = new BSTNode(kevinProfile);
		BSTNode nodeTwo = new BSTNode(cateProfile);
		BSTNode nodeThree = new BSTNode(maggyProfile);
		
		nodeOne.setL(nodeTwo);
		nodeOne.setR(nodeThree);
		
		System.out.println("Left Node: " + nodeOne.getL().getProfile());
		System.out.println("Right Node: " + nodeOne.getR().getProfile());
	}
}
