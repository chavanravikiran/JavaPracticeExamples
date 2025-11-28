package StringExample;

//String[] str ={"Flower","Fly","Floor","flap"};
public class FindOutHowManyCharSameInArray {
	public static void main(String[] argsD) {
		String[] str ={"Flower","Flowe","Flower","Flowp"};
		
		String temp= str[0];
		String result = "";
		for (int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			for(int j=1; j <str.length;j++) {
				if (i >= str[j].length() || str[j].charAt(i) != ch) {
					 System.out.println(result);
	                    return;
				}
			}
			result += ch;
		}
		 System.out.println(result);
	}
}
