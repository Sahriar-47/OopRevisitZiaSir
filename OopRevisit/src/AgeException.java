import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

class InvalidDeptException extends Exception {
    public InvalidDeptException(String m) {
        super(m);
    }
}

public class AgeException {
    public static void validate(int age, String dept)
            throws InvalidAgeException, InvalidDeptException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        if (!dept.equals("ICT")) {
            throw new InvalidDeptException("Department must be ICT.");
        }
        System.out.println("Valid age: " + age + ", Department: " + dept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your dept: ");
        String dept = sc.nextLine();

        try {
            validate(age, dept);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Age Exception: " + e.getMessage());
        } catch (InvalidDeptException d) {
            System.out.println("Caught Dept Exception: " + d.getMessage());
        }
        finally{
            System.out.println("Always Execute");
        }
    }
}
