public class UnderGraduateStudentBuilder implements StudentBuilder {
    // A concreteBuilder which used for build the student who not graduate. [ Builder Pattern ]
    public void getGraduateStatus(Student student){
        student.setStudentState(new UnderGraduateStudent(student));
    }
}