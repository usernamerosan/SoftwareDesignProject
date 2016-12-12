import java.util.Scanner;

/**
 * Created by Admin on 12/12/2016.
 */
public class UnderGraduateStudentBuilder implements StudentBuilder{
    Scanner scan = new Scanner(System.in);

    private boolean checkIDPattern(String input) {
        return input.matches("[0-9]{9}");
    }

    private boolean checkNamePattern(String input) {
        return input.matches("[A-Za-z -]{1,255}");
    }

    // builder pattern for instantiating undergraduate student with state equal to "Undergraduate student"
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
            System.out.print("Student lastname :");
            input = scan.next();
            if(checkNamePattern(input)){
                break;
            }
            System.out.println("invalid lastname");
        }
        student.setLastName(input);
        // set state of the student to "Undergraduate student"
        student.setStudentState("Undergraduate student");
        return student;
    }
}
