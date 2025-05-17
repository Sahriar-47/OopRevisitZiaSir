package JavaCollection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");

            System.out.print("Employee ID (int): ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            employeeMap.put(empId, department);
        }
        System.out.println("\nEmployee ID to Department Map:");
        for(Integer key: employeeMap.keySet()){
            System.out.println("ID: "+key+" ->"+employeeMap.get(key));
        }

        sc.close();
    }
}

