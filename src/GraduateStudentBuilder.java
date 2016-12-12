public class GraduateStudentBuilder implements StudentBuilder {
    // A concreteBuilder which used for build the student who graduated.
    public void getGraduateStatus(Student student){
       student.setStudentState(new GraduateStudent(student));
    }
}
