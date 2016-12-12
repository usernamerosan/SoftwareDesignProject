public class Student extends Person {
    private String studentId;
    private Course course = new Course();

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

    public String GetCourseName() {
        return this.course.getCourseName();
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void SetStudentMidtermScore(String c, int m) {
        if (this.course.getCourseName() == c) {
            this.course.setMidtermExamScore(m);
        }
    }

    public void SetHomeWorkScore(String c, int h) {
        if (this.course.getCourseName() == c) {
            this.course.setHoweworkScore(h);
        }
    }

    public void SetProjectScore(String c, int p) {
        if (this.course.getCourseName() == c) {
            this.course.setProjectScore(p);
        }
    }

    public void SetFinalExamScore(String c, int f) {
        if (this.course.getCourseName() == c) {
            this.course.setFinalExamScore(f);
        }
    }

    public void SetCourseName(String c) {
        this.course.setCourseName(c);
    }

    public void SetGrade(String g) {
        this.course.SetGrade(g);
    }

    public int GetTotalScore(String c) {
        if (this.course.getCourseName() == c) {
            return this.course.GetTotalScore();
        } else return 0;
    }

    public void showPersonalInformation() {
        studentState.showPersonalInformation();
    }

}
