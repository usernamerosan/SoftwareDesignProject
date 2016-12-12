public class UnderGraduateStudent implements StudentStatus {

    Student student;

    public  UnderGraduateStudent(Student newStudent) {
        student = newStudent;
    }

    @Override
    public void showPersonalInformation() {
        System.out.println("Student ID : "+ student.getStudentId());
        System.out.println("First Name : "+ student.getFirstName());
        System.out.println("Last Name : "+ student.getLastName());
        System.out.println("Student Status : Undergraduate Student");
    }
}
