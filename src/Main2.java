public class Main2 {
    public static void main(String[] args) {
        CourseList courseList = new CourseList();

        Course OOPCourse = courseList.getCourse("OOP");

        Student s10 = new Student();
        s10.setFirstName("E-MIND");
        s10.setLastName("DOK");
        s10.setStudentId("572115063");
        s10.addCourseName(OOPCourse);
        s10.SetStudentMidtermScore(OOPCourse, 20);
        s10.SetHomeWorkScore(OOPCourse, 20);
        s10.SetProjectScore(OOPCourse, 20);
        s10.SetFinalExamScore(OOPCourse, 20);

        Course abcCourse = courseList.getCourse("ABC");
        s10.addCourseName(abcCourse);
        s10.SetStudentMidtermScore(abcCourse, 20);
        s10.SetHomeWorkScore(abcCourse, 9);
        s10.SetProjectScore(abcCourse, 12);
        s10.SetFinalExamScore(abcCourse, 18);

        IGradeCalculator i = new GradeCalculatorByCriteria();
        i.SetMaxA(100);
        i.SetMaxB(80);
        i.SetMaxC(60);
        i.SetMaxD(50);
        i.SetMaxF(50);

        i.SetScore(s10);
        s10.showAllScore();

        Student s11 = new Student();
        s11.setFirstName("E-MIND2");
        s11.setLastName("DOK");
        s11.setStudentId("572115063");
        s11.addCourseName(OOPCourse);
        s11.SetStudentMidtermScore(OOPCourse, 20);
        s11.SetHomeWorkScore(OOPCourse, 0);
        s11.SetProjectScore(OOPCourse, 0);
        s11.SetFinalExamScore(OOPCourse, 0);

        i.SetScore(s11);

        s11.showAllScore();

//        Student s1 = new Student();
//        s1.setFirstName("Alex");
//        s1.setLastName("Kristopher");
//        s1.setStudentId("0001");
//        s1.SetCourseName("OOP");
//        s1.SetHomeWorkScore("OOP", 20);
//        s1.SetProjectScore("OOP", 20);
//        s1.SetStudentMidtermScore("OOP", 22);
//        s1.SetFinalExamScore("OOP", 24);
//
//        Student s2 = new Student();
//        s2.setFirstName("Chris");
//        s2.setLastName("Tesla");
//        s2.setStudentId("0002");
//        s2.SetCourseName("OOP");
//        s2.SetHomeWorkScore("OOP", 10);
//        s2.SetProjectScore("OOP", 15);
//        s2.SetStudentMidtermScore("OOP", 20);
//        s2.SetFinalExamScore("OOP", 17);
//
//        Student s3 = new Student();
//        s3.setFirstName("David");
//        s3.setLastName("Bahmm");
//        s3.setStudentId("0003");
//        s3.SetCourseName("OOP");
//        s3.SetHomeWorkScore("OOP", 4);
//        s3.SetProjectScore("OOP", 4);
//        s3.SetStudentMidtermScore("OOP", 12);
//        s3.SetFinalExamScore("OOP", 10);
//
//        Student s4 = new Student();
//        s4.setFirstName("Alex");
//        s4.setLastName("Kristopher");
//        s4.setStudentId("0004");
//        s4.SetCourseName("OOP");
//        s4.SetHomeWorkScore("OOP", 15);
//        s4.SetProjectScore("OOP", 15);
//        s4.SetStudentMidtermScore("OOP", 14);
//        s4.SetFinalExamScore("OOP", 15);
//
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
