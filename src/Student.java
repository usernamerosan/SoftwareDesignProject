import java.util.*;

public class Student extends Person {
    private String studentId;
    // We change one course to many courses by store it as Map with Grade for that course.
    private Map<Course, Grade> gradeByCourse = new HashMap<>();
    // The student have a status [ State Pattern ]
    private StudentStatus studentState;

    public StudentStatus getStudentState() {
        return studentState;
    }

    public void setStudentState(StudentStatus studentState) {
        this.studentState = studentState;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Change the implementation follows Map system.
    public void SetStudentMidtermScore(Course c, int m) {
        if (this.gradeByCourse.get(c) != null) {
            this.gradeByCourse.get(c).setMidtermExamScore(m);
        }
    }

    public void SetHomeWorkScore(Course c, int h) {
        if (this.gradeByCourse.get(c) != null) {
            this.gradeByCourse.get(c).setHomeworkScore(h);
        }
    }

    public void SetProjectScore(Course c, int p) {
        if (this.gradeByCourse.get(c) != null) {
            this.gradeByCourse.get(c).setProjectScore(p);
        }
    }

    public void SetFinalExamScore(Course c, int f) {
        if (this.gradeByCourse.get(c) != null) {
            this.gradeByCourse.get(c).setFinalExamScore(f);
        }
    }

    // To input a course to the Map.
    public void addCourseName(Course c) {
        this.gradeByCourse.putIfAbsent(c, new Grade(c));
    }

    // Show all course list.
    public List<Course> getCourseList() {
        return new ArrayList<>(gradeByCourse.keySet());
    }

    public void SetGrade(Course c, String g) {
        this.gradeByCourse.get(c).SetGrade(g);
    }

    public int GetTotalScore(Course c) {
        if (this.gradeByCourse.get(c) != null) {
            return this.gradeByCourse.get(c).GetTotalScore();
        } else return 0;
    }

    // To view information, we let the state decide the implementation [ State Pattern ]
    public void showPersonalInformation() {
        studentState.showPersonalInformation();
    }

    // Show all scores according to the registered course.
    public void showAllScore() {
        for(Course c : this.getCourseList()) {
            System.out.println(gradeByCourse.get(c).GetGradeDetail());
        }
        System.out.println("---------------------------------------");
    }
}
