package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.PokemonsService;

public class PokeTrainer {
	
	Scanner scan = new Scanner(System.in);
	PokeUsersMenuController logout = new PokeUsersMenuController();
	PokemonsService pokeservice = new PokemonsService();
	
	public void pokeTrainerMenu() {
		System.out.println("\nWelcome trainer! Have a wonderful adventure! Here are things you can do"
				+ "\n1. View your Pokemon."
				+ "\n2. Give another trainer some of your PokeDollars."
				+ "\n3. Recieve some PokeDollars from another trainer."
				+ "\n4. View account information."
				+ "\n5. Logout");
		
		String pokeTrainerAnswer = scan.nextLine();
		
		switch (pokeTrainerAnswer) {
		case "1":
			System.out.println("Please enter your Pokemon Persona:");
			String pokePersona = scan.nextLine();
			pokeservice.getPokemonWithPokemonPersona(pokePersona);
			
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			logout.pokeuserMenu();
			break;
		default:
			System.out.println("\nSorry trainer. I can't help you if you don't give me an appropriate number answer. Please try again!");
		}
		pokeTrainerMenu();
	}

}
