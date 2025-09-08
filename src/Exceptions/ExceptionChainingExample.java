package Exceptions;

public class ExceptionChainingExample {
	public static void main(String[] args) {
		try {
			performTask();
		}catch (IllegalStateException e) {
			System.out.println("Illegal State Exception "+e);
		}catch (NumberFormatException e) {
			System.out.println("Number Format Exception "+e);
		} catch (Exception e) {
			System.out.println("Generic Exception Occur "+e);
		}
	}

	static void performTask() {
		String input = "abcd";
		int number = Integer.parseInt(input);
		System.out.println(number);
	}
}
