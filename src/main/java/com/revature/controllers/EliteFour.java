package com.revature.controllers;
import com.revature.services.PokeUsersService;

import java.util.Scanner;


public class EliteFour {
	
	Scanner scan = new Scanner(System.in);
	PokeUsersMenuController logout = new PokeUsersMenuController();
	PokeUsersService pokeUserService = new PokeUsersService();
	
	public void eliteFourMenu() {
		System.out.println("Welcome Elite Four member! You've come a long way in your journey, but you're not quite at the top yet! Here's what you can do: "
				+"\n1. View all Pokemon from all trainers!"
				+"\n2. View all trainer PokeDollars."
				+"\n3. Change trainer's password."
				+"\n4. View account information."
				+"\n5. Logout");
		
		String eliteFourAnswer = scan.nextLine();
		
		switch (eliteFourAnswer) {
		
		case "1": 
			break;
		case "2":
			break;
		case "3": 
			System.out.println("Please type the username of the Trainer who's password you're about to change!");
			String username = scan.nextLine();
			System.out.println("What would you like to change the Trainer's password to?");
			String answer = scan.nextLine();
			int password = answer.hashCode();
			pokeUserService.changeTrainerPasswordByUsername(username, password);
			System.out.println("\nGotcha! "+username+"'s password has been changed to "+answer+"!\n");
			break;
		case "4":
			break;
		case "5":
			System.out.println("Have a great day Elite Four member! Hope to see you again!");
			logout.pokeuserMenu();
			break;
		default: 
			System.out.println("Sorry Elite Four member, that wasn't a number I was looking for. Please try again!");	
		}
		eliteFourMenu();
	}
	
	public static void main (String[]args) {
		EliteFour eliteFour = new EliteFour();
		eliteFour.eliteFourMenu();
	}

}
