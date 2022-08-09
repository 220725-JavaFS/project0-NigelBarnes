package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.PokeUsersService;

public class GymLeader {
	
	Scanner scan = new Scanner(System.in);
	PokeUsersMenuController logout = new PokeUsersMenuController();
	PokeUsersService pokeUserService = new PokeUsersService();
	
    public void gymLeaderMenu() {
    	System.out.println("\nWelcome back to your gym, Gym Leader! Your Pokemon have missed you dearly! If you have forgotten what you are allowed to do, here are your options: "
       			+ "\n1. Give a Pokemon Trainer PokeDollars from your own account."
    			+ "\n2. Take PokeDollars from a Pokemon Trainer."
    			+ "\n3. View a PokemonTrainer's PokeDollars."
    			+ "\n4. View account information."
    			+ "\n4. Logout.");
    	
    	String gymLeaderAnswer = scan.nextLine();
    	
    	switch(gymLeaderAnswer) {
    	
    	case "1": 
			break;
		case "2":
			break;
		case "3":
				System.out.println("What is the Username of the trainer you would like to see?\n");
				String username = scan.nextLine();
			pokeUserService.seeSinglePokeDollarsByUsername(username);
			break;	
		case "4":
			break;
		case "5":
			System.out.println("Have a great day Gym Leader! Hope to see you again!\n");
			logout.pokeuserMenu();
			
			break;
		default: 
			System.out.println("Sorry Gym Leader, that wasn't a number I was expecting. Please try again!\n");
    	}
    	gymLeaderMenu();
    	
    }
    public static void main (String[]args) {
    	GymLeader gym = new GymLeader();
    	gym.gymLeaderMenu();
    	
    }
}
