public class GraduateStudent implements StudentStatus {

    Student student;

    public GraduateStudent(Student newStudent) {
        student = newStudent;
    }

    @Override
    public void showPersonalInformation() {
        System.out.println("Student ID : "+ student.getStudentId());
        System.out.println("First Name : "+ student.getFirstName());
        System.out.println("Last Name : "+ student.getLastName());
        System.out.println("Student State : Graduate Student");
    }
}
