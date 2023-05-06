package car;

import java.util.Scanner;

public class Users {
	public static void main(String[] args) {
		new Users();
	}
	
	Users(){
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
			System.out.println("\n1. BMW \n2. Maruti Suzuki \nPress any other key to exit \nEnter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("--------------BMW--------------");
				Operation.BMW();
				break;
			case 2:
				System.out.println("--------------Maruti Suzuki--------------");
				Operation.MarutiSuzuki();
				break;
			default:
				System.out.println("Thank you !!!");
				a = false;
			}
		}
	}
}
