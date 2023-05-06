package car;

import java.util.Scanner;

public class Operation {
	static Scanner sc = new Scanner(System.in);
	
	public static void BMW() {
		boolean ab = true;
		while(ab) {
			System.out.println("1. X1 \n2. X2 \n3. X3 \n4. Back to main menu \nPress any other key to exit \nEnter your choice");
			int ch1 = sc.nextInt();
			switch(ch1) {
			case 1:
				System.out.println("----------------X1 features---------------");
				X1 x1 = new X1();
				x1.adjustable();
				x1.logo();
				x1.sunroof();
				x1.tires();
				x1.NAV();
				break;
			case 2:
				System.out.println("------------------X2 features----------------");
				X2 x2 = new X2();
				x2.croseControl();
				x2.logo();
				x2.NAV();
				x2.tires();
				x2.sunroof();
				break;
			case 3:
				System.out.println("------------------X3 features----------------");
				X3 x3 = new X3();
				x3.croseControl();
				x3.adjustable();
				x3.sunroof();
				x3.tires();
				break;
			case 4:
				new Users();
			default:
				System.out.println("Exit !!!");
				ab = false;
			}
		}
	}
	
	public static void MarutiSuzuki() {
		boolean as = true;
		while(as) {
			System.out.println("1. Swift \n2. Breeza \n3. Back to main menu \nPress any other key to exit \nEnter your choice");
			int ch2 = sc.nextInt();
			switch(ch2) {
			case 1:
				System.out.println("------------------Swift features-----------------");
				swift s = new swift();
				s.metalbody();
				s.logo();
				s.tires();
				s.topspeed();
				break;
			case 2:
				System.out.println("------------------Breeza features-----------------");
				Breeza b = new Breeza();
				b.metalbody();
				b.logo();
				b.tires();
				b.torque();
				break;
			case 3:
				new Users();
			default:
				System.out.println("Exit !!!");
				as = false;
			}
		}
	}
}
