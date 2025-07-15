package StringExample;

import java.math.BigDecimal;

//Convert String Integer
//Convert integer to String
public class ConvertStringToIntegerAndWisevarsa {

	public static void main(String[] args) {
		String str = "50";
		Integer no = Integer.parseInt(str);
		System.out.println("Convert String to Integer "+no);
		
		String newString = no.toString();
		System.out.println("convert Integer to String "+newString);
		
		
		// String to Double
        String doubleStr = "45.67";
        Double doubleVal = Double.parseDouble(doubleStr);
        System.out.println("Convert String to Double: " + doubleVal);
        
     // Double to String
        String doubleToStr = doubleVal.toString();
        System.out.println("Convert Double to String: " + doubleToStr);
        
        // String to Long
        String longStr = "123456789";
        Long longVal = Long.parseLong(longStr);
        System.out.println("Convert String to Long: " + longVal);

        // Long to String
        String longToStr = longVal.toString();
        System.out.println("Convert Long to String: " + longToStr);
        
        // String to Float
        String floatStr = "12.34";
        Float floatVal = Float.parseFloat(floatStr);
        System.out.println("String to Float: " + floatVal);
        System.out.println("Float to String: " + floatVal.toString());
		
     // String to BigDecimal
        String bigDecimalStr = "9876543210.12345";
        BigDecimal bigDecimalVal = new BigDecimal(bigDecimalStr);
        System.out.println("String to BigDecimal: " + bigDecimalVal);
        System.out.println("BigDecimal to String: " + bigDecimalVal.toString());
	}
}
