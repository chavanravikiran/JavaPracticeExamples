package Collections_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
    int id;
    String name;
    double percentage;
    int age;

    // Constructor
    public Student1(int id, String name, double percentage, int age) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.age = age;
    }

    // Overriding toString() for better printing
    @Override
    public String toString() {
        return "ID: " + id + ", StudentName: " + name + ", Percentage: " + percentage + "%, Age: " + age;
    }
}

public class GenericStudentExample {
	public static void main(String[] args) {
        // Creating a generic collection (ArrayList of Students)
        ArrayList<Student1> studentList = new ArrayList<>();

        // Adding student objects to the list
        studentList.add(new Student1(1, "Ravi", 85.5, 20));
        studentList.add(new Student1(2, "Kiran", 78.2, 21));
        studentList.add(new Student1(3, "Chavan", 92.7, 22));

        // Iterating through the list and printing student details
        for (Student1 student : studentList) {
            System.out.println(student); // toString() is automatically called
        }
        
        //Iterate using Stream API
        List<String> names= studentList.stream()
        					.map(s -> s.name)
        					.collect(Collectors.toList());
        
        System.out.println("Student Names: " + names);
    }
}
