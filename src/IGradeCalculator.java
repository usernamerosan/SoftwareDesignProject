public interface IGradeCalculator {
    void SetMaxA(int score);//Set Maximum score for Grade A

    void SetMaxB(int score);//Set Maximum score for Grade B

    void SetMaxC(int score);//Set Maximum score for Grade C

    void SetMaxD(int score);//Set Maximum score for Grade D

    void SetMaxF(int score);//Set Maximum score for Grade F

    void SetScore(Student s);//Set score for grade calculation

    //String GetGrade(); // Remove it because we have already created
    // a new method for show the grade calculation in the Student class.

    void SetMinA(int score);//Set Minimum score for Grade A

    void SetMinB(int score);//Set Minimum score for Grade B

    void SetMinC(int score);//Set Minimum score for Grade C

    void SetMinD(int score);//Set Minimum score for Grade D

    void SetMinF(int score);//Set Minimum score for Grade F
}
