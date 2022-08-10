package com.revature.controllers;

import java.util.List;
import java.util.Scanner;

import com.revature.models.PokeUsers;
import com.revature.models.Pokemons;
import com.revature.services.PokePersonaService;
import com.revature.services.PokeUsersService;
import com.revature.services.PokemonsService;

public class PokeUsersMenuController {
	
	private PokeUsersService pokeUsersService = new PokeUsersService();
	private PokemonsService pokemonsService = new PokemonsService();
	private PokePersonaService pokePersonaService = new PokePersonaService();
    private Scanner scan = new Scanner(System.in);
	private Scanner userUsername = new Scanner(System.in);
	private Scanner userPassword = new Scanner(System.in);
	
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
			  PokeUserLogin();
		 break switchChoice;
		 case "0": 			 
			 System.exit(0);
		 break switchChoice;
		 default:
			 System.out.println("Sorry trainer, that didn't really make any sense. I know you can do it though! Try again!\n");
		 break switchChoice;
		  }
		 
		}
				
	  }
	
	public void gymLeaderMenu() {
    	System.out.println("\nWelcome back Gym Leader! Your Pokemon have missed you dearly! If you have forgotten what you are allowed to do, here are your options: "
       			+ "\n1. Give a Pokemon Trainer PokeDollars."
    			+ "\n2. View a Pokemon Trainer's PokeDollars."
    			+ "\n3. View account information."
    			+ "\n4. Logout.");
    	
    	String gymLeaderAnswer = scan.nextLine();
    	
    	switch(gymLeaderAnswer) {
    	
    	case "1": 
    		System.out.println("Please enter the username of the trainer you would like to give the PokeDollars to below!\n");
            String username3 = scan.nextLine();
            System.out.println("Now can you enter the amount of PokeDollars you would like to give them?\n");
            double answer = Double.parseDouble(scan.nextLine());
      
            System.out.println("\n==========================SUCCESS=====================================\n");
            pokeUsersService.depositPokeDollarsIntoAccount(username3, answer);
            System.out.println("\n==========================SUCCESS=====================================\n");
			break;
		case "2":
			System.out.println("Perfect! In order to see their PokeDollars can you please provide the trainer's username?\n");
			String answer1 = scan.nextLine();
			System.out.println("\n==========================SUCCESS=====================================\n");
			System.out.print("Here's the PokeDollars listed in their account: ");
			pokeUsersService.seeSinglePokeDollarsByUsername(answer1);
			System.out.println("\n======================================================================\n");
			break;	
		case "3":
			System.out.println("Do you mind entering the username of the user you would like to view?\n");
			String username1 = scan.nextLine();
			System.out.println("\n===============================================================\n");
			pokeUsersService.getAccountInfoByUsername(username1);
			System.out.println("\n===============================================================\n");
			break;
		case "4":
			System.out.println("Have a great day Gym Leader! Hope to see you again!\n");
			pokeuserMenu();
			break;
		default: 
			System.out.println("Sorry Gym Leader, that wasn't a number I was expecting. Please try again!\n");
    	}
    	gymLeaderMenu();
		
   }
	
	public void eliteFourMenu() {
		System.out.println("\nWelcome Elite Four member! You've come a long way in your journey, but you're not quite at the top yet! Here's what you can do: "
				+"\n1. View all Pokemon from all trainers!"
				+"\n2. Change trainer's password."
				+"\n3. View account information."
				+"\n4. Logout.");
		
		String eliteFourAnswer = scan.nextLine();
		
		switch (eliteFourAnswer) {
		
		case "1": 
			System.out.println("Here's every Trainer Persona and their cauught Pokemon:\n");
			List<Pokemons> pokemonsList = pokemonsService.catchEmAll();
			for (Pokemons a: pokemonsList) {
				System.out.println(a);
			}
			break;
		case "2": 
			System.out.println("Please type the username of the Trainer who's password you're about to change!");
			String username = scan.nextLine();
			System.out.println("What would you like to change the Trainer's password to?");
			String answer = scan.nextLine();
			int password = answer.hashCode();
			pokeUsersService.changeTrainerPasswordByUsername(username, password);
			System.out.println("\n==========================SUCCESS=====================================\n");
			System.out.println("\nGotcha! "+username+"'s password has been changed to "+answer+"!\n");
			System.out.println("\n======================================================================\n");
			break;
		case "3":
			System.out.println("Do you mind entering your trainer Username again?\n");
			String username1 = scan.nextLine();
			System.out.println("\n===============================================================\n");
			pokeUsersService.getAccountInfoByUsername(username1);
			System.out.println("\n===============================================================\n");
			break;
		case "4":
			System.out.println("Alright, logging you out! Have a great day Elite Four member! Hope to see you again!\n");
			pokeuserMenu();
			
			break;
		default: 
			System.out.println("Sorry Elite Four member, that wasn't a number I was looking for. Please try again!\n");	
		}
		eliteFourMenu();
	}
	
	public void pokeTrainerMenu() {
		System.out.println("\nWelcome trainer! Have a wonderful adventure! Here are things you can do"
				+ "\n1. View your Pokemon."
				+ "\n2. View account information."
				+ "\n3. Logout.");
		
		String pokeTrainerAnswer = scan.nextLine();
		
		switch (pokeTrainerAnswer) {
		case "1":
			System.out.println("Please enter your Pokemon Persona:");
			String pokePersona = scan.nextLine();
			System.out.println("\n==========================SUCCESS=====================================\n");
			pokemonsService.getPokemonWithPokemonPersona(pokePersona);
			System.out.println("\n==========================SUCCESS=====================================\n");
			break;   
		case "2":
			System.out.println("Do you mind entering your Poke Username again?\n");
			String username1 = scan.nextLine();
			System.out.println("\n===============================================================\n");
			pokeUsersService.getAccountInfoByUsername(username1);
			System.out.println("Perfect! You have just added the money to your account.");
			System.out.println("\n===============================================================\n");
			break;
		case "3":
			pokeuserMenu();
			break;
		default:
			System.out.println("\nSorry trainer. I can't help you if you don't give me an appropriate number answer. Please try again!");
		}
		pokeTrainerMenu();
	}
	
	public void championMenu () {
		System.out.println("\nWelcome Champion! As the leader of your region, you have the ability perform a variety of tasks! Please select an option from below: "
				+"\n1. Print all Pokemon Trainers!"	
				+"\n2. View account information."
				+"\n3. Change a Trainer's password."
				+"\n4. Logout");
		
		String championAnswer = scan.nextLine();
		
		switch (championAnswer) {
		
		case "1":
			System.out.println("Here's every Trainer Persona and their cauught Pokemon:\n");
			List<Pokemons> pokemonsList = pokemonsService.catchEmAll();
			for (Pokemons a: pokemonsList) {
				System.out.println(a);
			}
			break;
		case "2":
			System.out.println("Do you mind entering your Poke Username again?\n");
			String username1 = scan.nextLine();
			System.out.println("\n===============================================================\n");
			pokeUsersService.getAccountInfoByUsername(username1);
			System.out.println("\n===============================================================\n");
			break;
		case "3":
			System.out.println("Please type the username of the Trainer who's password you're about to change!");
			String username = scan.nextLine();
			System.out.println("What would you like to change the Trainer's password to?");
			String answer = scan.nextLine();
			int password = answer.hashCode();
			pokeUsersService.changeTrainerPasswordByUsername(username, password);
			System.out.println("\n==========================SUCCESS=====================================\n");
			System.out.println("\nGotcha! "+username+"'s password has been changed to "+answer+"!\n");
			System.out.println("\n======================================================================\n");
			break;
		case "4":
			System.out.println("See you next time Champion!\n");
			 pokeuserMenu();
			 
			 break;
			default:
				System.out.println("Hmm, sorry Champion, that didn't really make any sense. Can you please try again!\n");
		}
		championMenu();
	}
	
	public void PokeUserLogin () {
		System.out.println("========================WELCOME=======================================\n");
		System.out.println("Welcome trainer! Before I can help you, could you please login with your username and password?"
				+"\n\nEnter Username: ");
		
		String username = userUsername.nextLine();
		
		System.out.println("\nNow can you enter your password?"
				+"\n\nPassword: ");
		
		String answer = userPassword.nextLine();
		int password = answer.hashCode();
		
		PokeUsers user = pokeUsersService.loginUsers(username, password);
		
		if (user!=null) {
			System.out.println("\n==========================SUCCESS=====================================\n");
			System.out.println("\nPerfect! You're signed in!\n");
			System.out.println("\n==========================SUCCESS=====================================\n");
		} else {
			System.out.println("\n==========================FAILURE=====================================\n");
			System.out.println("\nHmm that seems to be the wrong password and/or username. You might want to try again.\n");
			System.out.println("\n==========================FAILURE=====================================\n");
		}
		try {
		
			if (user.getAccountType().equals("Elite Four")) {
				 eliteFourMenu();
			} else if (user.getAccountType().equals("Champion")) {
				championMenu();
			} else if (user.getAccountType().equals("Poke Trainer")) {
				pokeTrainerMenu();
			}else if (user.getAccountType().equals("Gym Leader")) {
				gymLeaderMenu();
			}else {
				System.out.println("\nThat's not right! Why do you not have any Account Type??");
				pokeuserMenu();
				
			}
			
		} catch (Exception e) {
			System.out.println("\nHmmm I can't seem to find you. Are you sure you're a true Pokemon trainer?\n");
			pokeuserMenu();
			}

		
	}
	
	public static void main (String[]args) {
	PokeUsersMenuController poke = new PokeUsersMenuController();
	poke.pokeuserMenu();
	
	
}
	
}



