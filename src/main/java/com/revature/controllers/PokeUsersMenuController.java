package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.PokeUsers;
import com.revature.services.PokeUsersService;

public class PokeUsersMenuController {
	
	private PokeUsersService pokeUsersService = new PokeUsersService();
    private Scanner scan = new Scanner(System.in);
	
	public void pokeuserMenu () {
		String choice = "";
		menuLoop:
		while(!choice.equals("0")) {
		System.out.println("Hello there! Welcome to the world of Pokémon! What would you like to do? "
				+ "\n 1. Check account information"
				+ "\n 0. Exit the application");
		 choice = scan.nextLine();
		 switchChoice:
		 switch (choice) {
		 case "1":
			 loginPokeUsers();
		 break switchChoice;
		 case "0": 			 
		 break switchChoice;
		 default:
			 System.out.println("Sorry trainer, that didn't really make any sense. I know you can do it though! Try again! ");
		 break switchChoice;
		  }
		 
		}
				
	}
	
	private void loginPokeUsers() {
		String username ="";
		int password;
		String a = "";
		while(username.equals("")&a.equals("")) {
		System.out.println("Perfect! To get started I'm going to need you to login in! Can you please enter your username?"
				+ "+ \nUsername: ");
		 username = scan.next();
		 System.out.println("What about your password?"
		 		+ "\nPassword: ");
		 a = scan.nextLine();
		 password = a.hashCode();
		 
		 System.out.println(username + a);
		 
		 
		}
		
	}

	public static void main (String[]args) {
		
		PokeUsersMenuController poke = new PokeUsersMenuController();
		poke.pokeuserMenu();
		
		
	}
}
