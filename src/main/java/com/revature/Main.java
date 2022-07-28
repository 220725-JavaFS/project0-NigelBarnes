package com.revature;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
	Scanner gameUser = new Scanner(System.in);
	
	System.out.print("Please enter your username: ");
	
	String user = gameUser.nextLine();
	
	System.out.println("\nPerfect! Welcome back "+user+" it has been a long time since you've been here.\n");
	
	System.out.print("Now I need your password. Please enter it here: ");
	
	String pass = gameUser.nextLine();
	
	System.out.println("\nAre you sure your password is "+pass+"? I don't want to send the wrong information.");
		
	
	gameUser.close();
	
		
  }

}
