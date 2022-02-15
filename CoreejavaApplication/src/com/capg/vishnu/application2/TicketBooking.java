package com.capg.vishnu.application2;

import java.util.Scanner;

public class TicketBooking {
	enum module1 {
		O, P, R, E
	}

	enum submodule1 {
		T, F, S, M
	}

	enum submodule11 {
		TM, HM, EM
	}

	enum submodule111 {
		VS
	}

	enum submodule112 {
		AK
	}

	enum submodule113 {
		JR
	}

	enum submodule211 {
		SV
	}

	enum submodule212 {
		A
	}

	enum submodule213 {
		BB
	}

	enum submodule311 {
		PH
	}

	enum submodule312 {
		SM
	}

	enum submodule313 {
		GF
	}

	enum submodule2 {
		TA
	}

	enum submodule21 {
		PN, PC, PU
	}

	enum submodule3 {
		I, S, M
	}

	enum submodule4 {
		E
	}

	static int amount;
	static int guest;
	static int additionalitemcost;
	static int menuitemcost;

	public static void main(String[] args) {

		String module = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t\t \t Welcome To TICKET BOOKING  SYSTEM");
		while (true) {
			System.out.println("======================");
			System.out.println("  Main Menu");
			System.out.println("======================");
			System.out.println("O-Order Module");
			System.out.println("P-Payment Module");
			System.out.println("R-Report Module");
			System.out.println("E-Quit Module");
			System.out.println("======================");
			System.out.println("Enter your Module code (O,P,R,E) : ");
			
			module = sc.nextLine();
			System.out.println("You entered module is  : ");
			switch (module1.valueOf(module)) {
			case O:

				System.out.println("Order Module");
				System.out.println("======================");
				System.out.println("T- to place orders for Ticket");
				System.out.println("F- to place orders for Food");
				System.out.println("S- to place for other services");
				System.out.println("M- Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (T,F,S,M) : ");

				module = sc.nextLine();
				switch (submodule1.valueOf(module)) {
				case T:
					System.out.println("Order Ticket");
					System.out.println("=============");
					System.out.println("Telugu Movies");
					System.out.println("Hindi Movies");
					System.out.println("English Movies");
					System.out.println("==============");
					System.out.println("Enter your Module code (TM,HM,EM) :");
					module = sc.nextLine();
					switch (submodule11.valueOf(module)) {
					case TM:
						System.out.println("=====================");
						System.out.println("Vakeel Saab");
						System.out.println("Akhanda");
						System.out.println("Jathi Ratnalu");
						System.out.println("=====================");
						System.out.println("Enter your Module code (VS,AK,JR) :");
						module = sc.nextLine();
						switch (submodule111.valueOf(module)) {
						case VS:
							System.out.println("Succesfully Booked Your Vakeel Saab Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule112.valueOf(module)) {
						case AK:
							System.out.println("Succesfully Booked Your Akhanda Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule113.valueOf(module)) {
						case JR:
							System.out.println("Succesfully Booked Your Jathi Ratnalu Ticked Enjoy Movie");
						}
					}
					module = sc.nextLine();
					switch (submodule11.valueOf(module)) {
					case HM:
						System.out.println("========================");
						System.out.println("Sooryavanshi");
						System.out.println("Antim");
						System.out.println("Bell Bottom");
						System.out.println("=========================");
						System.out.println("Enter your Module code (SV,A,BB) :");
						module = sc.nextLine();
						switch (submodule211.valueOf(module)) {
						case SV:
							System.out.println("Succesfully Booked Your Sooryavanshi Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule212.valueOf(module)) {
						case A:
							System.out.println("Succesfully Booked Your Antim Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule213.valueOf(module)) {
						case BB:
							System.out.println("Succesfully Booked Your Bell Bottom Ticked Enjoy Movie");
						}
					}
					module = sc.nextLine();
					switch (submodule11.valueOf(module)) {
					case EM:
						System.out.println("==============================");
						System.out.println(" The Pursuit of Happyness ");
						System.out.println(" Spider-Man ");
						System.out.println(" The Godfather ");
						System.out.println("==============================");
						System.out.println("Enter your Module code (PH,SM,GF) :");
						module = sc.nextLine();
						switch (submodule311.valueOf(module)) {
						case PH:
							System.out.println("Succesfully Booked Your The Pursuit of Happyness Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule312.valueOf(module)) {
						case SM:
							System.out.println("Succesfully Booked Your Spider-Man Ticked Enjoy Movie");
						}
						module = sc.nextLine();
						switch (submodule313.valueOf(module)) {
						case GF:
							System.out.println("Succesfully Booked Your The Godfather Ticked Enjoy Movie");
						}

					}

				case F:
					System.out.println("Menu \t Description  \t Charge per head ");
					System.out.println("===============================================");
					System.out.println("A \t CHIPS \n \t SAMOSA \n\t  BURGER \n\t MAGGI  \t\t\t RM100.00");
					System.out.println("");
					System.out.println(
							"B \t COCA-COLA \n \t PEPSI  \n\t DIET COKE \n\t DIET PEPSI \n\t MAZZA \t\t\t\tRM200.00");
					System.out.println("===============================================");
					System.out.println("Enter your Menu code (A,B) : ");

				case S:
					System.out.println("Services");
					System.out.println("===================");
					System.out.println("Ac-class");
					System.out.println("Balcony");
					System.out.println("Second class");
					System.out.println("===================");
					System.out.println("Enter your Module code (AC,BAL,SE) :");

				}

			case P:
				System.out.println("Payment Module");
				System.out.println("======================");
				System.out.println("TA- for Total Amount ");
				System.out.println("M- Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (TA,M): ");

			case R:
				System.out.println("Report Module");
				System.out.println("======================");
				System.out.println("I- for Invoice ");
				System.out.println("S- for Summery ");
				System.out.println("M- Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (I,S,M):");

			case E:
				System.out.println("Quit Module");
				System.exit(0);
				break;

			}
		}
	}

}
