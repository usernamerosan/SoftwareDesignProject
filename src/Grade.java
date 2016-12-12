public class Grade {
    // Separate a grade information from the course class.
    // We can't keep the grade information in flyweight because a grade information never be the same.
    // But the result of a program should not change. Therefore we still have the course object in this class.
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
