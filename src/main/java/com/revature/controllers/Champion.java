package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.PokeUsersService;

public class Champion {
	
	Scanner scan = new Scanner(System.in);
	PokeUsersMenuController logout = new PokeUsersMenuController();
	PokeUsersService pokeUserService = new PokeUsersService();
	
	public void championMenu () {
		System.out.println("Welcome Champion! As the leader of your region, you have the ability perform a variety of tasks! Please select an option from below: "
				+"\n1. Print all Pokemon Trainers!"	
				+"\n2. View all pokemon from all trainers!"
				+"\n3. View account information."
				+"\n4. Change a Trainer's password."
				+"\n5. Logout");
		
		String championAnswer = scan.next();
		
		switch (championAnswer) {
		
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			System.out.println("Please type the username of the Trainer who's password you're about to change!");
			String username = scan.nextLine();
			System.out.println("What would you like to change the Trainer's password to?");
			String answer = scan.nextLine();
			int password = answer.hashCode();
			pokeUserService.changeTrainerPasswordByUsername(username, password);
			System.out.println("\nGotcha! "+username+"'s password has been changed to "+answer+"!\n");
			break;
		case "5":
			System.out.println("See you next time Champion!");
			 logout.pokeuserMenu();
			break;
			default:
				System.out.println("Hmm, sorry Champion, that didn't really make any sense. Can you please try again!");
			break;
		}
		championMenu();
	}
	
  public static void main (String[]args) {
	  Champion champion = new Champion();
	  champion.championMenu();
  }
}
