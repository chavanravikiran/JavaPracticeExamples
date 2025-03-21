package BeginnerExample;

import java.util.Scanner;

//153 = 1³ + 5³ + 3³ = 153 (Armstrong Number)
//9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 (Armstrong Number)
public class ArmstrongNumber {
	public static void main(String[] args) {

		int arm = 0, a, b, c, temp, no;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		temp = no;

		while (no > 0) {
			a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		if (arm == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}
}
