import java.util.*;
public class studentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        Student toRemove = null;
        for(Student s:students){
            if(s.getRollNumber()==rollNumber){
                toRemove=s;
                break;
            }
        }
        if(toRemove!=null){
            students.remove(toRemove);System.out.println("Student removed.");
        }
    }

    public Student searchStudent(int rollNumber) {
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) return s;
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}