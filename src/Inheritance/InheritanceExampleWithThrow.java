package Inheritance;

import java.io.IOException;
import java.sql.SQLException;

public class InheritanceExampleWithThrow {
	public static class Parent {
		String getClassIdentifier() throws IOException, SQLException {
			return "";
		}
	}

	public static class Child extends Parent {
		public String getClassIdentifier() {
			return "#89893_TEST_ID";
		}
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		try {
			p.getClassIdentifier();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

		Child c = new Child();
		c.getClassIdentifier();

		Parent p1 = new Child();
		try {
			p1.getClassIdentifier();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}



