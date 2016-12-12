import java.util.HashMap;
import java.util.Map;

public class CourseList {
    // Flyweight Factory [ Flyweight Pattern ]
    // HashMap used to cache the course object which can reuse later.
    private Map<String, Course> courseList = new HashMap<String, Course>();
    public Course getCourse(String c) {
        courseList.putIfAbsent(c, new Course(c)); // A new method which can check whether the object exists or not?
        // if exist then we can put a new object into a HashMap.
        // Return the object to the caller.
        return courseList.get(c);
    }
}
