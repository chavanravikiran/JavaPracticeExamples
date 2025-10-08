package StringExample;

//Input :- I Love My India
//Output :- ILMI
public class GetFirstCharOnlyFromSentence {
	public static void main(String[] args) {
        String str = " I Love My India ";
        String[] words = str.split(" ");
        String temp = "";
        for (String word : words) {
        	if (!word.isEmpty()) {  
        		temp += word.charAt(0);
        	}
        }
        System.out.println("------>" + temp);
    }
}
