public class Grade {
    private Course course;
    private int midtermExamScore;
    private int homeworkScore;
    private int projectScore;
    private int finalExamScore;
    private String Grade;

    public Grade(Course course) {
        this.course = course;
    }

    public void setMidtermExamScore(int midtermExamScore) {
        this.midtermExamScore = midtermExamScore;
    }

    public void setHomeworkScore(int homeworkScore) {
        this.homeworkScore = homeworkScore;
    }

    public void setProjectScore(int projectScore) {
        this.projectScore = projectScore;
    }

    public int GetTotalScore() {
        return this.midtermExamScore + this.homeworkScore + this.projectScore + this.finalExamScore;
    }
    public void setFinalExamScore(int finalExamScore) {
        this.finalExamScore = finalExamScore;
    }

    public void SetGrade(String g) {
        this.Grade = g;
    }

    public String GetGradeDetail() {
        String studyresult = "Subject " + this.course.getCourseName() + " with Total Score " + this.GetTotalScore() + " Get Grade " + this.Grade;
        return studyresult;
    }
}
