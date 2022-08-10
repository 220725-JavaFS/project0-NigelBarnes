package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.PokeUsers;
import com.revature.services.PokeUsersService;
import com.revature.models.*;

public class PokeLogin {
	
	private PokeUsersService pokeService = new PokeUsersService();
		private Scanner scan = new Scanner(System.in);
		private Scanner userUsername = new Scanner(System.in);
		private Scanner userPassword = new Scanner(System.in);
//     	private EliteFour eliteFour = new EliteFour();
//		private Champion champion = new Champion();
//		private PokeTrainer pokeTrainer = new PokeTrainer();
//		private GymLeader gymLeader = new GymLeader();
		
		public void PokeUserLogin () {
			System.out.println("\nWelcome trainer! Could you please login with your username and password?"
					+"\nEnter Username: ");
			
			String username = userUsername.nextLine();
			
			System.out.println("\nNow may can you enter your password?"
					+"\nEnter Password: ");
			
			String answer = userPassword.nextLine();
			int password = answer.hashCode();
			
			PokeUsers user = pokeService.loginUsers(username, password);
			
			if (user!=null) {
				System.out.println("\nPerfect! You're signed in!\n");
			} else {
				System.out.println("\nHmm that seems to be the wrong password and/or username. You might want to try again.\n");
			}
			
//			if (user.getAccountType().equals("Elite Four")) {
//				 eliteFour.eliteFourMenu();
//			} else if (user.getAccountType().equals("Champion")) {
//				champion.championMenu();
//			} else if (user.getAccountType().equals("Poke Trainer")) {
//				pokeTrainer.pokeTrainerMenu();
//			}else if (user.getAccountType().equals("Gym Leader")) {
//				gymLeader.gymLeaderMenu();
//			}
			
		}
		
		public void PokeUsercheckAccountType() {
			System.out.print("Hi there User, now we're going to check whether you are an Elite Four memeber, or gym leader. What are you?");
			
			String type = scan.nextLine();
			
			System.out.println(type);
			
			PokeLogin login = new PokeLogin();
			login.PokeUserLogin(); 
		}

}
