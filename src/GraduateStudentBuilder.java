public class GraduateStudentBuilder implements StudentBuilder {
    public void getGraduateStatus(Student student){
       student.setStudentState("Graduated student");
    }
}
