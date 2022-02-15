package com.capg.vishnu.application2;

import java.util.Scanner;

import com.capg.vishnu.application2.TicketBooking.module1;
import com.capg.vishnu.application2.TicketBooking.submodule1;
import com.capg.vishnu.application2.TicketBooking.submodule11;
import com.capg.vishnu.application2.TicketBooking.submodule111;
import com.capg.vishnu.application2.TicketBooking.submodule112;
import com.capg.vishnu.application2.TicketBooking.submodule113;
import com.capg.vishnu.application2.TicketBooking.submodule211;
import com.capg.vishnu.application2.TicketBooking.submodule212;
import com.capg.vishnu.application2.TicketBooking.submodule213;

public class ImaxTicketBooking {
	enum module1 {
		O, P, R, E
	}

	enum submodule1 {
		T, F, S, M
	}

	enum submodule2 {
		T, P, M
	}

	enum submodule3 {
		I, S, M
	}

	enum submodule4 {
		E
	}

	enum menucode {
		A, B
	}
	enum moviecode{
		A,B,C
	}
	enum Telugucode{
		A,P,J
	}

	static int amount;
	static int guest;
	static int additionalitemcost;
	static int menuitemcost;
	static int amountdisc;

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
			switch (module1.valueOf(module)) {
			case O:

				System.out.println("Order Module");
				System.out.println("======================");
				System.out.println("T- to Book Ticket");
				System.out.println("F- to place orders for Food");
				System.out.println("S- to place for other services");
				System.out.println("M- Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (F,S,M) : ");

				module = sc.nextLine();
				switch (submodule1.valueOf(module)) {
				case T:
					System.out.println("Welcome to Ticket Booking ");
					System.out.println("==================================");
					System.out.println("Press A for Telugu Movie Booking ");
					System.out.println("Press B for Hindhi Movie Booking ");
					System.out.println("Press C for English Movie Booking ");
					System.out.println("==================================");
					System.out.println("Enter your Module Option (A,B,C) : ");
					module=sc.nextLine();
					switch(moviecode.valueOf(module)) {
					case A:
						System.out.println("Welcome to Telugu Movies ");
						System.out.println("=========================");
						System.out.println("List of Telugu Movies ");
						System.out.println("Press A for Akanda Movie");
						System.out.println("Press P for Pushpa Movie");
						System.out.println("Press J for Jay Beam ");
						System.out.println("========================");
						System.out.println("Press Your Selected Module (A,P,J) : ");
						
						module=sc.nextLine();
						switch(Telugucode.valueOf(module)) {
						case A:
							System.out.println("Hello You Selected Akanda Movie Enjoy the Day");
							System.out.println("=============================================");
							System.out.println("Select Pament Module ");
							System.out.println("########################");
							
						}
						break;
							
						
					
					}
					break;
					
					
				case F:
					System.out.println("Menu \t\t Display\t\t Charge for Head");
					System.out.println("=====================================");
					System.out.println(" A \t Chips\n\t Samosa\n\t Cookies\n\t Nuts \n\t Grains");
					System.out.println(" ");
					System.out.println(" B \t Mazza\n\t Pepsi\n\t Cock\n\t Dry Cock \n\t Sprite");
					System.out.println(" ");
					System.out.println("======================================");
					System.out.println("Enter your Module code (A,B) : ");

					module = sc.nextLine();
					switch (menucode.valueOf(module)) {
					case A:
						menuitemcost = 100;
						break;
					case B:
						menuitemcost = 150;
						break;
					}

					System.out.println("Enter the number of Guests");

					guest = Integer.parseInt(sc.nextLine());
					System.out.println("you selected no of guests are " + guest);
					amount = menuitemcost * guest;

					System.out.println("Amount for ordered food before discount is Rs" + amount);
					if (guest >= 1 && guest <= 25)
						amountdisc = (int) (amount - (amount * 0.00));
					if (guest >= 26 && guest <= 50)
						amountdisc = (int) (amount - (amount * 0.03));
					else if (guest >= 51 && guest <= 100)
						amountdisc = (int) ((amount - guest * 0.05));
					else if (guest >= 101 && guest <= 200)
						amountdisc = (int) ((amount - guest * 0.08));
					else if (guest >= 251)
						amountdisc = (int) ((amount - guest * 0.10));

					System.out
							.println("Amount for ordered food after Discount for selected guests is  Rs" + amountdisc);
					break;

				case S:
					System.out.println("Item\t Discription\t charge per unit");
					System.out.println("====================================");
					System.out.println("1\t Tent \t RM400.00 per unit of 10 by 10 ft");
					System.out.println("2\tchairs\t RM200.00 per unit of 40 by 5 Rs ");
					System.out.println("3\t Table \t RM100.00 per unit of 2 by 50 Rs");
					System.out.println("=====================================");
					System.out.println("Enter your Module code (1,2,3) :");

					module = sc.nextLine();

					int i = Integer.parseInt(module);
					switch (i) {
					case 1:
						additionalitemcost = 400;
						break;
					case 2:
						additionalitemcost = 200;
						break;
					case 3:
						additionalitemcost = 100;
						break;
					}

					System.out.println("Your additional cost of : Rs " + additionalitemcost);

					break;
				}
				break;
			case P:
				System.out.println(" Payment Module");
				System.out.println("======================");
				System.out.println("T-to display total amount to be paid");
				System.out.println("P-to make payment");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (T,P,M) : ");

				module = sc.nextLine();
				switch (submodule2.valueOf(module)) {
				case T:
					System.out.println("Total Amount to be Paid : Rs" + (amount + additionalitemcost));

					break;
				case P:
					System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));
					break;
				}
				break;
			case R:
				System.out.println("Report Module");
				System.out.println("==============");
				System.out.println(" Payment Module");
				System.out.println("======================");
				System.out.println("I-to dispaly invoice for order mode");
				System.out.println("S-to display the summary of orders and payments made");
				System.out.println("M-Return to Main Menu");
				System.out.println("======================");
				System.out.println("Enter your Module code (I,S,M) : ");

				module = sc.nextLine();

				switch (submodule3.valueOf(module)) {
				case I:
					System.out.println("Invoice Display");
					System.out.println("==================");
					System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
					System.out.println("you selected no of guests are " + guest);
					System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));
					break;
				case S:
					System.out.println("Summary Of Order");
					System.out.println("======================");
					System.out.println("you selected Food item cost Rs" + amount);
					System.out.println("you selected no of guests are " + guest);
					System.out
							.println("Amount for ordered food after Discount for selected guests is  Rs" + amountdisc);
					System.out.println("Your Additional Cost : Rs " + additionalitemcost);
					System.out.println("\n");
					System.out.println("Total Amount to be Paid : Rs" + (amount + additionalitemcost));
					System.out.println("To Make Payment : Rs" + (amountdisc + additionalitemcost));

					break;
				}
				break;
			case E:
				System.out.println("Exit Module ");
				System.out.println("============");
				System.exit(0);
				break;
			}

		}
	}
}
