public class GradeCalculatorByCriteria implements IGradeCalculator {
    int a, b, c, d, f, temp;

    @Override
    public void SetMaxA(int score) {
        this.a = score;
    }

    @Override
    public void SetMaxB(int score) {
        this.b = score;
    }

    @Override
    public void SetMaxC(int score) {
        this.c = score;
    }

    @Override
    public void SetMaxD(int score) {
        this.d = score;
    }

    @Override
    public void SetMaxF(int score) {
        this.f = score;
    }

    // Edit this method which can define the score to the student's courses immediately.
    @Override
    public void SetScore(Student s) {
        for(Course course : s.getCourseList()) {
            temp = s.GetTotalScore(course);
            if (temp > b) {
                s.SetGrade(course, "A");
            } else if (temp > c) {
                s.SetGrade(course, "B");
            } else if (temp > d) {
                s.SetGrade(course, "C");
            } else if (temp > f) {
                s.SetGrade(course, "D");
            } else s.SetGrade(course, "F");
        }
    }

    public void SetMinA(int score) {
    }

    public void SetMinB(int score) {
    }

    public void SetMinC(int score) {
    }

    public void SetMinD(int score) {
    }

    public void SetMinF(int score) {
    }
}
