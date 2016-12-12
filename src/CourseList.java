import java.util.HashMap;
import java.util.Map;

public class CourseList {
    Map<String, Course> courseList = new HashMap<String, Course>();
    public Course getCourse(String c) {
        courseList.putIfAbsent(c, new Course(c));
        return courseList.get(c);
    }
}
