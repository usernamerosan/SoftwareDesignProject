public class GraduateStudent implements StudentStatus {
    // A concreteState of StudentStatus which determine a student status is "Graduate".
    Student student;

    public GraduateStudent(Student newStudent) {
        student = newStudent;
    }

    @Override
    public void showPersonalInformation() {
        System.out.println("---------------------------------------");
        System.out.println("Student ID : "+ student.getStudentId());
        System.out.println("First Name : "+ student.getFirstName());
        System.out.println("Last Name : "+ student.getLastName());
        System.out.println("Student State : Graduate Student");
        System.out.println("**************");
    }
}
