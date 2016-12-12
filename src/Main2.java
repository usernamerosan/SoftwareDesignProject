public class Main2 {
    public static void main(String[] args) {
        // Create courseList which stores courses object.
        CourseList courseList = new CourseList(); // [ Flyweight Pattern ]

        // Create a director for build the student object.
        StudentDirector studentDirector = new StudentDirector(); // [ Builder Pattern ]

        // First we will let you build a UnderGraduate Student.
        // Then we set the director to build it.
        studentDirector.setBuilder(new UnderGraduateStudentBuilder()); // Inside this builder use [ State Pattern ]

        // Create first example
        Student student1 = studentDirector.createStudent("0001", "Alex", "Kristopher");

        // Then we put some course to this student.
        // We store course object from the "courseList" in a variable for re-using further.
        Course oopCourse = courseList.getCourse("OOP");
        student1.addCourseName(oopCourse);

        // We put scores of this to the course.
        student1.SetStudentMidtermScore(oopCourse, 20);
        student1.SetHomeWorkScore(oopCourse, 5);
        student1.SetProjectScore(oopCourse, 10);
        student1.SetFinalExamScore(oopCourse, 34);

        // We show another course example.
        Course ooadCourse = courseList.getCourse("OOAD");
        student1.addCourseName(ooadCourse);

        // The same processes as above example.
        student1.SetStudentMidtermScore(ooadCourse, 13);
        student1.SetHomeWorkScore(ooadCourse, 10);
        student1.SetProjectScore(ooadCourse, 15);
        student1.SetFinalExamScore(ooadCourse, 10);

        // Now we want to see the grades for each course.
        // So we have to create the Calculator.
        // In this example, we using the grade by criteria.
        IGradeCalculator gradeCalculator = new GradeCalculatorByCriteria();

        // We have to set criteria for calculating a grade before.
        gradeCalculator.SetMaxA(100);
        gradeCalculator.SetMaxB(80);
        gradeCalculator.SetMaxC(60);
        gradeCalculator.SetMaxD(50);
        gradeCalculator.SetMaxF(40);

        // Now we have the calculator.
        // We use it to calculate the student scores.
        gradeCalculator.SetScore(student1);

        // Finally, we show the grade for each course.
        // We also show the student information too.
        student1.showPersonalInformation();
        student1.showAllScore();
        System.out.println("\n");

        // The another student is a student who graduated.
        // We change builder to Graduate Student, So we change it in the director object.
        studentDirector.setBuilder(new GraduateStudentBuilder());
        Student student2 = studentDirector.createStudent("0002", "Charis", "Tesla");

        // Same step as first example.
        // We put a same course as above, but get the object from flyweight again.
        Course oopCourse2 = courseList.getCourse("OOP");
        student2.addCourseName(oopCourse2);

        // Put some score.
        student2.SetStudentMidtermScore(oopCourse2, 20);
        student2.SetHomeWorkScore(oopCourse2, 5);
        student2.SetProjectScore(oopCourse2, 10);
        student2.SetFinalExamScore(oopCourse2, 14);

        // But we choose mean based score as a criteria instead.
        MeanAndSDRangeCalculator meanCal = new MeanAndSDRangeCalculator();

        // Add Score for creating mean criteria
        meanCal.AddScore(student1.GetTotalScore(oopCourse));
        meanCal.AddScore(student2.GetTotalScore(oopCourse2));


        // Re-setting the criteria
        gradeCalculator.SetMaxA((int) meanCal.GetMaxForGradeA());
        gradeCalculator.SetMaxB((int) meanCal.GetMaxForGradeB());
        gradeCalculator.SetMaxC((int) meanCal.GetMaxForGradeC());
        gradeCalculator.SetMaxD((int) meanCal.GetMaxForGradeD());
        gradeCalculator.SetMaxF((int) meanCal.GetMaxForGradeF());


        // Same as the first example
        // Using the old calculator with new criteria.
        gradeCalculator.SetScore(student1);
        gradeCalculator.SetScore(student2);

        // Show the score
        student1.showPersonalInformation();
        student1.showAllScore();
        System.out.println("\n");
        student2.showPersonalInformation();
        student2.showAllScore();
    }
}
