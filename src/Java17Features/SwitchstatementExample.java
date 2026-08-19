package Java17Features;

import java.util.Scanner;

public class SwitchstatementExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Day - ");
		int input = sc.nextInt();
		
//		using Traditional Way Switch Statement
		usingTraditional(input);

		//		using Switch Expression
		usingSwitchExpression(input);
	}

	static void usingSwitchExpression(int input) {
		switch (input) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	static void usingTraditional(int input) {
//		below is working in java 17 version
//		String type = switch (input) {
//		    case 1, 2, 3, 4, 5 -> "Weekday";
//		    case 6, 7 -> "Weekend";
//		    default -> "Invalid";
//		};
	}
	
	static void usingYield(int input) {
//		below is working in java 17 version
//		int result = switch (input) {
//
	//	    case 1 -> 10;
	//
	//	    case 2 -> {
	//	        int x = 20;
	//	        int y = 30;
	//	        yield x + y;
	//	    }
	//
	//	    default -> 0;
	//	};
	}
}

