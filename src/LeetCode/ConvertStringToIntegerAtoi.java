package LeetCode;

public class ConvertStringToIntegerAtoi {
	
    public static void main(String[] args) {
    	
//    	for (int i = 0; i <= 127; i++) {
//        System.out.println(i + " -> " + (char) i);
//    }
    	ConvertStringToIntegerAtoi obj = new ConvertStringToIntegerAtoi();
        String s = "-91283472332";
        System.out.println(obj.myAtoi(s));
    }

    public int myAtoi(String s) {
        s = s.trim();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);

            // Allow + or - only at first position
            if (i == 0 && (a == 43 || a == 45)) {
                result += s.charAt(i);
                continue;
            }

            // Allow only digits
            if (a >= 48 && a <= 57) {
                result += s.charAt(i);
            } else {
                break;
            }
        }

        // Handle case like "+", "-", ""
        if (result.equals("+") || result.equals("-") || result.equals("")) {
            return 0;
        } else {
            try {
                return Integer.parseInt(result);
            } catch (NumberFormatException e) {
                //  Handle overflow
                if (result.charAt(0) == '-') {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
    }
}
