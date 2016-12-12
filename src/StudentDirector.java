import java.util.Scanner;

public class StudentDirector {
    private StudentBuilder studentBuilder;
    public void setBuilder(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }
    Scanner scan = new Scanner(System.in);

    private boolean checkIDPattern(String input) {
        return input.matches("[0-9]{9}");
    }

    private boolean checkNamePattern(String input) {
        return input.matches("[A-Za-z -]{1,255}");
    }

    // builder pattern for instantiating student with student builder to define the status of the student
    public UnderGraduateStudent createStudent() {
        UnderGraduateStudent student = new UnderGraduateStudent();
        String input;
        System.out.println("New Student Registration");
        while(true){
            System.out.print("Student ID : ");
            input = scan.next();
            if(checkIDPattern(input)){
                break;
            }
            System.out.println("Invalid student id");
        }
        student.setStudentId(input);
        while(true) {
            System.out.print("Student name : ");
            input = scan.next();
            if(checkNamePattern(input)){
                break;
            }
            System.out.println("invalid student name");
        }
        student.setFirstName(input);
        while(true){
            System.out.print("Student lastname : ");
            input = scan.next();
            if(checkNamePattern(input)){
                break;
            }
            System.out.println("invalid lastname");
        }
        student.setLastName(input);
        studentBuilder.getGraduateStatus(student);
        return student;
    }
}
