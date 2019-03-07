package com.capgemini.insurance.ui;

import java.util.Scanner;

import com.capgemini.insurance.bean.BikesInfo;
import com.capgemini.insurance.service.Service;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double premium=0;
		String year;
		String currentYear = "2019";
		Service service = new Service();
		BikesInfo bike1 = new BikesInfo("KTM", 250, 150000);
		BikesInfo bike2 = new BikesInfo("Pulsar", 220, 12000);
		BikesInfo bike3 = new BikesInfo("CBR", 150, 110000);
		BikesInfo bike4 = new BikesInfo("UNICORN", 250, 90000);
		BikesInfo bike5 = new BikesInfo("Splendor", 110, 60000);

		System.out.println("Welcome to Insurance Portal:");
		System.out.println("Following Bikes can be insured:");
		System.out
				.println("1.KTM 250\n2.Pulsar 220\n3.CBR 150\n4.Unicorn 150\n5.Splendor 110\n");
		System.out.println("Please enter a valid choice:");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the Bike Registration year:");
			year = scan.next();
			bike1.setYear(year);
			service.addBike(bike1);
			System.out.println("following are the types of Insurance available:\n1.Third party\2.Comprehensive");
			System.out.println("Please choose any 1 of the above options");
			
			int choice2 = scan.nextInt();
			if(choice2==1){
				premium = service.calculatePremium3rdParty(bike1);
				System.out.println("Your premium for the bike Third Party Insurance is:"+premium);
			}
			else if(choice2==2){
				premium = service.calculatePremiumComprehensive(bike1);
				System.out.println("Your premium for the bike Comprehensive Insurance is:"+premium);
			}
			
			
			break;
		}

		case 2: {
			System.out.println("Enter the Bike Registration year:");
			year = scan.next();
			bike2.setYear(year);
			service.addBike(bike2);
			System.out.println("following are the types of Insurance available:\n1.Third party\2.Comprehensive");
			System.out.println("Please choose any 1 of the above options");
			int choice2 = scan.nextInt();
			if(choice2==1){
				premium = service.calculatePremium3rdParty(bike2);
				System.out.println("Your premium for the bike Third Party Insurance is:"+premium);
			}
			else if(choice2==2){
				premium = service.calculatePremiumComprehensive(bike2);
				System.out.println("Your premium for the bike Comprehensive Insurance is:"+premium);
			}
			break;
		}

		case 3: {
			System.out.println("Enter the Bike Registration year:");
			year = scan.next();
			bike3.setYear(year);
			service.addBike(bike3);
			System.out.println("following are the types of Insurance available:\n1.Third party\2.Comprehensive");
			System.out.println("Please choose any 1 of the above options");
			int choice2 = scan.nextInt();
			if(choice2==1){
				premium = service.calculatePremium3rdParty(bike3);
				System.out.println("Your premium for the bike Third Party Insurance is:"+premium);
			}
			else if(choice2==2){
				premium = service.calculatePremiumComprehensive(bike3);
				System.out.println("Your premium for the bike Comprehensive Insurance is:"+premium);
			}
			break;
		}
		case 4: {
			System.out.println("Enter the Bike Registration year:");
			year = scan.next();
			bike4.setYear(year);
			service.addBike(bike4);
			System.out.println("following are the types of Insurance available:\n1.Third party\2.Comprehensive");
			System.out.println("Please choose any 1 of the above options");
			int choice2 = scan.nextInt();
			if(choice2==1){
				premium = service.calculatePremium3rdParty(bike4);
				System.out.println("Your premium for the bike Third Party Insurance is:"+premium);
			}
			else if(choice2==2){
				premium = service.calculatePremiumComprehensive(bike4);
				System.out.println("Your premium for the bike Comprehensive Insurance is:"+premium);
			}
			break;
		}
		case 5: {
			System.out.println("Enter the Bike Registration year:");
			year = scan.next();
			bike5.setYear(year);
			service.addBike(bike5);
			System.out.println("following are the types of Insurance available:\n1.Third party\2.Comprehensive");
			System.out.println("Please choose any 1 of the above options");
			int choice2 = scan.nextInt();
			if(choice2==1){
				premium = service.calculatePremium3rdParty(bike5);
				System.out.println("Your premium for the bike Third Party Insurance is:"+premium);
			}
			else if(choice2==2){
				premium = service.calculatePremiumComprehensive(bike5);
				System.out.println("Your premium for the bike Comprehensive Insurance is:"+premium);
			}
			break;
		}
		default:
			System.out.println("Invalid Choice");

		}
		
		
		
		
		

	}
}
