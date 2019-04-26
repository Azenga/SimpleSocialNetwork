package com.azenga;

public class BSTMain {

	public static void main(String[] args) {

		Profile mutai = new Profile("Mutai", "Mercy", 22, 6, 1997, "Bomet", "Kenya", "Kenyan", "mlinethmtai@gmail.com",
				new String[] { "Designing", "Sleeping" });
		Profile me = new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com",
				new String[] { "Programming", "Helping" });
		Profile maggy = new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan",
				"cellnmagy4@gmail.com", new String[] { "Travelling", "Sleeping" });
		Profile gugu = new Profile("Nyange", "John", 4, 8, 1995, "Vihiga", "Kenya", "Kenyan", "jnmajanga@gmail.com",
				new String[] { "Worshipping", "Networking" });
		Profile kanini = new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan",
				"catherine001@gmail.com", new String[] { "Data Analysis", "Sleeping" });
		Profile sanya = new Profile("Sanya", "Dianah", 4, 10, 1995, "Busia", "Kenya", "Kenyan", "dianasanyaa@gmail.com",
				new String[] { "Cooking", "Eating" });
		Profile mercy = new Profile("Kemboi", "Mercy", 30, 1, 1998, "Kitale", "Kenya", "Kenyan",
				"kemboi.mercy27@gmail.com", new String[] { "Watching", "Writing" });
		Profile aaron = new Profile("Aaron", "Kimutai", 22, 6, 1997, "Uasin Gishu", "Kenya", "Kenyan", "aaronkim@gmail.com",
				new String[] { "Draw", "Sleeping" });

		BST bst = new BST();

		bst.insertProfile(me);
		bst.insertProfile(maggy);
		bst.insertProfile(gugu);
		bst.insertProfile(mercy);
		bst.insertProfile(kanini);
		bst.insertProfile(sanya);
		bst.insertProfile(mutai);
		bst.insertProfile(aaron);

		bst.inOrder();

	}

}
