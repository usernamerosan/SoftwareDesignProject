public class StudentDirector {
    // Director class which used to create a student object corresponding to the builder object. [ Builder Pattern ]
    // Stores the concrete builder
    private StudentBuilder studentBuilder;
    public void setBuilder(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    // this method is used to create a student object.
    public Student createStudent(String id, String name, String lastName) {
        Student student = new Student();
        student.setStudentId(id);
        student.setFirstName(name);
        student.setLastName(lastName);
        studentBuilder.getGraduateStatus(student);
        return student;
    }
}
