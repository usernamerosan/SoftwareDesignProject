public class StudentDirector {
    private StudentBuilder studentBuilder;
    public void setBuilder(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    // builder pattern for instantiating student with student builder to define the status of the student
    public Student createStudent(String id, String name, String lastName) {
        Student student = new Student();
        student.setStudentId(id);
        student.setFirstName(name);
        student.setLastName(lastName);
        //studentBuilder.getGraduateStatus(student);
        return student;
    }
}
