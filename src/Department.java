import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Course> courses;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }
}