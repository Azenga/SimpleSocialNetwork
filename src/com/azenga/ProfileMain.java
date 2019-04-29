package com.azenga;

public class ProfileMain {
	
	public static void main(String[] args) {
		Profile memyProfile = new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com", new String[] {"Programming", "Helping"});
		Profile maggyProfile = new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan", "cellnmagy4@gmail.com", new String[] {"Travelling", "Sleeping"});
		Profile johnProfile = new Profile("Nyange", "John", 4, 8, 1995, "Vihiga", "Kenya", "Kenyan", "jnmajanga@gmail.com", new String[] {"Worshipping", "Networking"});
		Profile cateProfile = new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan", "catherine001@gmail.com", new String[] {"Data Analysis", "Sleeping"});
		
		System.out.println(memyProfile);
		System.out.println(maggyProfile);
		System.out.println(johnProfile);
		System.out.println(cateProfile);
	}

}
