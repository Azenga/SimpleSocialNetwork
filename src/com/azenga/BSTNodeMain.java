package com.azenga;

public class BSTNodeMain {
	public static void main(String[] args) {
		Profile me = new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com", new String[] {"Programming", "Helping"});
		Profile maggy = new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan", "cellnmagy4@gmail.com", new String[] {"Travelling", "Sleeping"});
		Profile kanini = new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan", "catherine001@gmail.com", new String[] {"Data Analysis", "Sleeping"});
		
		BSTNode one = new BSTNode(me);
		BSTNode two = new BSTNode(maggy);
		BSTNode three = new BSTNode(kanini);
		
		one.setL(two);
		one.setR(three);
		
		System.out.println(one.getL().getProfile());
	}
}
