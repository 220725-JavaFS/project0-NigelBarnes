package com.revature;

import com.revature.controllers.PokeUsersMenuController;

public class Main {
	
	public static void main (String[]args) {
		
		PokeUsersMenuController pokeUser = new PokeUsersMenuController();
		
		System.out.println("Your journey begins here.....loading...\n");
		
		pokeUser.pokeuserMenu();
		
		System.out.println("\nHope to see you again! Closing application now...");
  }

}
