package JavaCollection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Student {
    String name;
    String department;
    double marks;

    Student(String name, String department, double marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return name + " | " + department + " | " + marks;
    }
}

public class StudentTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Student ID (int): ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            studentMap.put(id, new Student(name, dept, marks));
        }

        System.out.println("\nStudent Records (sorted by ID):");
        for (Integer key: studentMap.keySet()) {
            System.out.println("ID: " + key+ " -> " + studentMap.get(key));
        }

        sc.close();
    }
}
