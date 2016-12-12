public class UnderGraduateStudent implements StudentStatus {
    // A concreteState of StudentStatus which determine a student status is "UnderGraduate". [ State Pattern ]
    Student student;

    public  UnderGraduateStudent(Student newStudent) {
        student = newStudent;
    }

    @Override
    public void showPersonalInformation() {
        System.out.println("---------------------------------------");
        System.out.println("Student ID : "+ student.getStudentId());
        System.out.println("First Name : "+ student.getFirstName());
        System.out.println("Last Name : "+ student.getLastName());
        System.out.println("Student Status : Undergraduate Student");
        System.out.println("**************");
    }
}
