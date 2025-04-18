import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentManagementSystem sms = new studentManagementSystem();

        while (true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Search Student\n4. Display All\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();  // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    sms.addStudent(new Student(name, roll, grade));
                }

                case 2 -> {
                    System.out.print("Enter roll number to remove: ");
                    sms.removeStudent(sc.nextInt());
                }

                case 3 -> {
                    System.out.print("Enter roll number to search: ");
                    Student found = sms.searchStudent(sc.nextInt());
                    if (found != null) System.out.println(found);
                    else System.out.println("Student not found.");
                }

                case 4 -> sms.displayAllStudents();

                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
            
        }
    }
}