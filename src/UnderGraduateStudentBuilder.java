public class UnderGraduateStudentBuilder implements StudentBuilder {
    public void getGraduateStatus(Student student){
        student.setStudentState("Undergraduate student");
    }
}