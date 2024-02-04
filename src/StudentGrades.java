import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a HashMap to store student grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add student grades
        studentGrades.put("shruthi", 85);
        studentGrades.put("priya", 78);
        studentGrades.put("lavanya", 62);

        // Retrieve and print grades
        int shruthiGrade = studentGrades.get("shruthi");
        int priyaGrade = studentGrades.get("priya");
        int lavanyaGrade = studentGrades.get("lavanya");

        System.out.println("shruthi's Grade: " + shruthiGrade);
        System.out.println("priya's Grade: " + priyaGrade);
        System.out.println("lavanya's Grade: " + lavanyaGrade);

        // Iterate through the HashMap
        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key exists
        boolean containsshruthi = studentGrades.containsKey("shruthi");
        System.out.println("Contains shruthi? " + containsshruthi);

        // Remove a student
        studentGrades.remove("priya");
        System.out.println("priya's Grade Removed.");
    }
}
