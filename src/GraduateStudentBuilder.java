public class GraduateStudentBuilder implements StudentBuilder {
    // A concreteBuilder which used for build the student who graduated. [ Builder Pattern ]
    public void getGraduateStatus(Student student){
       student.setStudentState(new GraduateStudent(student));
    }
}
