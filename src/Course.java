import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private List<Student> students;
    private Faculty faculty;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public void enrollStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void assignFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}