package Collection_Set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetClassBaseExample {
	 public static void main(String[] args) {
	        // Creating a HashSet of Student objects
	        HashSet<ClgStudent> students = new HashSet<>();

	        // Adding students to HashSet
	        students.add(new ClgStudent(1, "Alice", 20));
	        students.add(new ClgStudent(2, "Bob", 22));
	        students.add(new ClgStudent(3, "Charlie", 21));
	        students.add(new ClgStudent(1, "Alice", 20)); // Duplicate based on 'id', won't be added

	        // Displaying students in HashSet
	        for (ClgStudent s : students) {
	            System.out.println(s);
	        }
	    }
}


class ClgStudent{
	private int id;
    private String name;
    private int age;
    
    public ClgStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    // Overriding equals() to compare objects based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClgStudent student = (ClgStudent) obj;
        return id == student.id;  // Assuming id uniquely identifies a student
    }
    
 // Overriding hashCode() to ensure unique hashing based on id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString() method to print student details
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
