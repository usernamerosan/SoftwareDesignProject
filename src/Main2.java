public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //StudentStatus test1 = new UnderGraduateStudent(s1);
        StudentStatus test2 = new GraduateStudent(s1);
        s1.setFirstName("Alex");
        s1.setLastName("Kristopher");
        s1.setStudentId("0001");
        s1.SetCourseName("OOP");
        s1.SetHomeWorkScore("OOP", 20);
        s1.SetProjectScore("OOP", 20);
        s1.SetStudentMidtermScore("OOP", 22);
        s1.SetFinalExamScore("OOP", 24);
        s1.setStudentState(test2);

        s1.showPersonalInformation();



//
//        IGradeCalculator i = new GradeCalculatorByCriteria();
//        i.SetMaxA(100);
//        i.SetMaxB(80);
//        i.SetMaxC(60);
//        i.SetMaxD(50);
//        i.SetMaxF(50);
//
//        i.SetScore(s1);
//        s1.SetGrade(i.GetGrade());
//        System.out.println(s1.GetStudyResult());
//        i.SetScore(s2);
//        s2.SetGrade(i.GetGrade());
//        System.out.println(s2.GetStudyResult());
//        i.SetScore(s3);
//        s3.SetGrade(i.GetGrade());
//        System.out.println(s3.GetStudyResult());
//        i.SetScore(s4);
//        s4.SetGrade(i.GetGrade());
//        System.out.println(s4.GetStudyResult());
//
//        System.out.println("");
//        System.out.println("Rescale the score criteria");
//
//        i.SetMaxA(100);
//        i.SetMaxB(80);
//        i.SetMaxC(70);
//        i.SetMaxD(50);
//        i.SetMaxF(20);
//
//        i.SetScore(s1);
//        s1.SetGrade(i.GetGrade());
//        System.out.println(s1.GetStudyResult());
//        i.SetScore(s2);
//        s2.SetGrade(i.GetGrade());
//        System.out.println(s2.GetStudyResult());
//        i.SetScore(s3);
//        s3.SetGrade(i.GetGrade());
//        System.out.println(s3.GetStudyResult());
//        i.SetScore(s4);
//        s4.SetGrade(i.GetGrade());
//        System.out.println(s4.GetStudyResult());
//
//        System.out.println("");
//        System.out.println("Rescale the score criteria for Grading by Mean");
//        MeanAndSDRangeCalculator cals = new MeanAndSDRangeCalculator();
//        cals.AddScore(s1.GetTotalScore("OOP"));
//        cals.AddScore(s2.GetTotalScore("OOP"));
//        cals.AddScore(s3.GetTotalScore("OOP"));
//        cals.AddScore(s4.GetTotalScore("OOP"));
//        i.SetMaxA((int) cals.GetMaxForGradeA());
//        i.SetMaxB((int) cals.GetMaxForGradeB());
//        i.SetMaxC((int) cals.GetMaxForGradeC());
//        i.SetMaxD((int) cals.GetMaxForGradeD());
//        i.SetMaxF((int) cals.GetMaxForGradeF());
//
//        i.SetScore(s1);
//        s1.SetGrade(i.GetGrade());
//        System.out.println(s1.GetStudyResult());
//        i.SetScore(s2);
//        s2.SetGrade(i.GetGrade());
//        System.out.println(s2.GetStudyResult());
//        i.SetScore(s3);
//        s3.SetGrade(i.GetGrade());
//        System.out.println(s3.GetStudyResult());
//        i.SetScore(s4);
//        s4.SetGrade(i.GetGrade());
//        System.out.println(s4.GetStudyResult());
    }
}
