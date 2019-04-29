package com.azenga;

public class BSTMain {

	public static void main(String[] args) {

		Profile mutaiProfile = new Profile("Mutai", "Mercy", 22, 6, 1997, "Bomet", "Kenya", "Kenyan", "mlinethmtai@gmail.com",
				new String[] { "Designing", "Sleeping" });
		Profile memyProfile = new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com",
				new String[] { "Programming", "Helping" });
		Profile maggyProfile = new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan",
				"cellnmagy4@gmail.com", new String[] { "Travelling", "Sleeping" });
		Profile johnProfile = new Profile("Nyange", "John", 4, 8, 1995, "Vihiga", "Kenya", "Kenyan", "jnmajanga@gmail.com",
				new String[] { "Worshipping", "Networking" });
		Profile cateProfile = new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan",
				"catherine001@gmail.com", new String[] { "Data Analysis", "Sleeping" });
		Profile dianaProfile = new Profile("Sanya", "Dianah", 4, 10, 1995, "Busia", "Kenya", "Kenyan", "dianasanyaa@gmail.com",
				new String[] { "Cooking", "Eating" });
		Profile kembProfile = new Profile("Kemboi", "Mercy", 30, 1, 1998, "Kitale", "Kenya", "Kenyan",
				"kemboi.mercy27@gmail.com", new String[] { "Watching", "Writing" });
		Profile aaronProfile = new Profile("Aaron", "Kimutai", 22, 6, 1997, "Uasin Gishu", "Kenya", "Kenyan", "aaronkim@gmail.com",
				new String[] { "Draw", "Sleeping" });

		BST bst = new BST();

		bst.insertProfile(memyProfile);
		bst.insertProfile(maggyProfile);
		bst.insertProfile(johnProfile);
		bst.insertProfile(kembProfile);
		bst.insertProfile(cateProfile);
		bst.insertProfile(dianaProfile);
		bst.insertProfile(mutaiProfile);
		bst.insertProfile(aaronProfile);
		
		System.out.println("In Alphabetical Order\n=============================\n");

		bst.printAlphabetically();

	}

}
