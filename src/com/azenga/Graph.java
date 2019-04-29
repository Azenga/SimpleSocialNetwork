package com.azenga;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

	public static final List<Profile> suscribers = Arrays.asList(new Profile[] {
			new Profile("Mutai", "Mercy", 22, 6, 1997, "Bomet", "Kenya", "Kenyan", "mlinethmtai@gmail.com",
					new String[] { "Designing", "Sleeping" }),
			new Profile("Azenga", "Kevin", 10, 6, 1995, "Vihiga", "Kenya", "Kenyan", "toomuch573@gmail.com",
					new String[] { "Programming", "Helping" }),
			new Profile("Mumbua", "Maggy", 24, 10, 1997, "Machakos", "Kenya", "Kenyan", "cellnmagy4@gmail.com",
					new String[] { "Travelling", "Sleeping" }),
			new Profile("Nyange", "John", 4, 8, 1995, "Vihiga", "Kenya", "Kenyan", "jnmajanga@gmail.com",
					new String[] { "Worshipping", "Networking" }),
			new Profile("Kiema", "Catherine", 2, 7, 1998, "Makueni", "Kenya", "Kenyan", "catherine001@gmail.com",
					new String[] { "Data Analysis", "Sleeping" }),
			new Profile("Sanya", "Dianah", 4, 10, 1995, "Busia", "Kenya", "Kenyan", "dianasanyaa@gmail.com",
					new String[] { "Cooking", "Eating" }),
			new Profile("Kemboi", "Mercy", 30, 1, 1998, "Kitale", "Kenya", "Kenyan", "kemboi.mercy27@gmail.com",
					new String[] { "Watching", "Writing" }),
			new Profile("Aaron", "Kimutai", 22, 6, 1997, "Uasin Gishu", "Kenya", "Kenyan", "aaronkim@gmail.com",
					new String[] { "Draw", "Sleeping" }) });

	private BST bst;

	public Graph(String fileName, BST bst) {
		this.bst = bst;

		List<Edge> connections = getFriendLinks(fileName);

		System.out.println("\n");

		populateFriendList(connections);

	}

	private void populateFriendList(List<Edge> connections) {

		for (Edge conn : connections) {
			for (Profile profile : suscribers) {
				if (profile.getName().equalsIgnoreCase(conn.name)) {
					for (Profile prof : suscribers) {
						if (prof.getName().equalsIgnoreCase(conn.friendName)) {
							profile.addFriend(prof);

							System.out.println(conn.friendName + " added to " + conn.name + " friends");
						}
					}
				}
			}
		}

		System.out.println("\nDone populating friends\n");

	}

	public List<Edge> getFriendLinks(String fileName) {

		List<Edge> connections = new ArrayList<Graph.Edge>();

		try {
			//Reading the connections / Friends from the passed file in our case "friends.txt"
			BufferedReader reader = new BufferedReader(new java.io.FileReader(new File(fileName)));

			String line = reader.readLine().trim();

			while (line != null) {
				//Separating the names of the friends to get the connection edges
				String names[] = line.split(",");
				boolean nameInBST = false, nameOneInBST = false;
				
				//Check whether every name in the file is contained in the BST before adding the connection
				for (Profile profile : suscribers) {
					if (profile.getName().equalsIgnoreCase(names[0].trim()))
						nameInBST = true;
					if (profile.getName().equalsIgnoreCase(names[1].trim()))
						nameOneInBST = true;
				}

				if (nameInBST && nameOneInBST) {
					Edge edge = new Edge(names[0].trim(), names[1].trim());
					System.out.println(edge);
					connections.add(edge);

				} else {
					System.err.println("Sorry name no on BST");
					System.exit(404);
				}

				line = reader.readLine();

			}

		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}

		return connections;
	}

	public BST[] friendRecommendations(Profile[] users) {
		
		int bstCount = 0;
		
		BST[] bstArr = new BST[users.length];
		
		for (Profile user : suscribers) {
			BST bst = new BST();
			
			//Getting the list of friends of the current user
			List<Profile> friends = new ArrayList<Profile>();
			if (user.getNumberOfFriends() > 0) {
				
				int count = 0;
				while (count < user.getNumberOfFriends()) {
					friends.add(user.getFriend(count));
					count++;
				}
				
				for(Profile friend: friends) {
					// Getting the friends to the each friend of the current user
					if (friend.getNumberOfFriends() > 0) {
						int fcount = 0;
						while (fcount < friend.getNumberOfFriends()) {
							
							//CHecking whether the friends friend is the already a friend to our subscriber then adding or ignoring the profile
							if(friends.contains(friend.getFriend(fcount))) {
								fcount++;
								continue;
							}else {
								//Adding the friend to a list of the current user's friends
								bst.insertProfile(friend.getFriend(fcount));
							}
							
							fcount++;
						}
					}			
				}
			}
			
			// Updating the indices of the global array of users friends collection
			bstArr[bstCount++] = bst;
			
		}
		
		return bstArr;

	}
	
	//A class to help keep track of the connections, however you can use a Map if you want

	class Edge {
		String name, friendName;

		public Edge(String name, String friendName) {
			super();
			this.name = name;
			this.friendName = friendName;
		}

		@Override
		public String toString() {
			return String.format("%s -> %s", name, friendName);
		}

	}
}
