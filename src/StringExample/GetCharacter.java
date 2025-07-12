package StringExample;

public class GetCharacter {
	public static void main(String[] args) {
		String str = "Ravikiran Chavan";
		
		for (int i = 0; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("Charector position 3 "+str.charAt(3));
		System.out.println("Charector position 7 "+str.charAt(7));	
		System.out.println("Charector position10 "+str.charAt(10));	
//		System.out.println("Charector position 16 "+str.charAt(16));	//Exception StringIndexOutOfBoundsException
	}
}
