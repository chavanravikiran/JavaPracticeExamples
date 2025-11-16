package StringExample;

//Input=aabcaaccc
//Output=a=2,b=1,c=1,a=2,c=3
public class HCLQuestionNo2 {
	public static void main(String[] args) {
		String str = "aabcaaccc";

        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == current) {
                count++;
            } else {
                System.out.println(current + "=" + count);
                current = ch;
                count = 1;
            }
        }

        // print last group
        System.out.println(current + "=" + count);
	}
}