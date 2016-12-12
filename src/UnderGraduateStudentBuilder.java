public class UnderGraduateStudentBuilder implements StudentBuilder {
    public void getGraduateStatus(Student student){
        student.setStudentState(new UnderGraduateStudent(student));
    }
}