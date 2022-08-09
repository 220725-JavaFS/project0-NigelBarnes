package com.revature.controllers;

import java.util.Scanner;

public class Champion {
	
	Scanner scan = new Scanner(System.in);
	PokeUsersMenuController logout = new PokeUsersMenuController();
	
	public void championMenu () {
		System.out.println("Welcome Champion! As the leader of your region, you have the ability perform a variety of tasks! Please select an option from below: "
				+"\n1. Print all Pokemon Trainers!"	
				+"\n2. Dismiss a trainer!"
				+"\n3. View all pokemon from all trainers!"
				+"\n4. View account information."
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
