package StringExample;

public class OutputTrace3 {
	public static void main(String[] args) {
		try {
			int []a= {1,2,3};
			System.out.println(a[5]);
			
			System.out.println(10/0);
		}
		catch (ClassCastException e) {
			System.out.println("ClassCastException :"+e);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException :"+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException :"+e);
		}
		catch (Exception e) {
			System.out.println("Exception :"+e);
		}
		
	}
}
