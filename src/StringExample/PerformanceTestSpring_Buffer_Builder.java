package StringExample;

public class PerformanceTestSpring_Buffer_Builder {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String str = new String("Java");
		for (int i = 0; i < 1000; i++) {
			str.concat("Technology");
		}
		System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuffer sbuffer = new StringBuffer("Java");
		for (int i = 0; i < 1000; i++) {
			sbuffer.append("Technology");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("Java");
		for (int i = 0; i < 1000; i++) {
			sbuilder.append("Technology");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
