package Collection_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentManagementSystem {
	public static void main(String[] args) {
        // Creating a HashMap to store student ID and Student object
        HashMap<Integer, Student> studentMap = new HashMap<>();

        // 1. Adding students
        studentMap.put(101, new Student(101, "Ravi", 20, "Computer Science"));
        studentMap.put(102, new Student(102, "Kiran", 22, "Mechanical Engineering"));
        studentMap.put(103, new Student(103, "Atul", 21, "Electrical Engineering"));

        // 2. Retrieving student details
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // 3. Checking if a student exists
        int searchId = 105;
        if (studentMap.containsKey(searchId)) {
            System.out.println("Student with ID " + searchId + " found: " + studentMap.get(searchId));
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // 4. Updating student course
        if (studentMap.containsKey(103)) {
            studentMap.get(103).setCourse("Civil Engineering");
            System.out.println("Updated Student 103: " + studentMap.get(103));
        }

        // 5. Removing a student
        studentMap.remove(102);
        System.out.println("\nAfter removing Student 102:");

        // 6. Displaying all students
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // 7. Checking if the HashMap is empty
        System.out.println("\nIs the student map empty? " + studentMap.isEmpty());

        // 8. Clearing all students
        studentMap.clear();
        System.out.println("All students removed. Total students: " + studentMap.size());
    }
}


class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    // Setters (if needed)
    public void setCourse(String course) { 
    	this.course = course; 
    }

    // Overriding toString() for better printing
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }

    // Overriding equals() and hashCode() for proper comparison
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Student student = (Student) obj;
//        return id == student.id && age == student.age &&
//               Objects.equals(name, student.name) && Objects.equals(course, student.course);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, course);
    }
}