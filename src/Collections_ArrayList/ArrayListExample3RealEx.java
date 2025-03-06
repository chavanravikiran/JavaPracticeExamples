package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3RealEx {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ravikiran");
		Student s1 = new Student(1, "Chavan");
		
		ArrayList a1 = new ArrayList<>();
		a1.add(e1);
		a1.add(s1);
		
		for (Object a : a1) {
			System.out.println("Array List Print - "+a);
		}
		for(Object obj : a1) {
			if(obj instanceof Employee) {
				Employee ee = (Employee)obj;
				System.out.println(ee.empId +" - "+ee.empName);
			}else if(obj instanceof Student){
				Student ss = (Student)obj;
				System.out.println(ss.studentId +" - "+ss.studentName);
			}
		}
		
		
	}
}

