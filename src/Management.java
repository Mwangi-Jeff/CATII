import java.util.ArrayList;
import java.util.List;

public class Management implements IManageable {
    private List<Student> students;
    private List<Faculty> faculties;
    private List<Course> courses;
    private List<Department> departments;

    public Management() {
        this.students = new ArrayList<>();
        this.faculties = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    @Override
    public void addPerson(Student student) {
        this.students.add(student);
    }

    @Override
    public void addPerson(Faculty faculty) {
        this.faculties.add(faculty);
    }

    @Override
    public void removePerson(Student student) {
        this.students.remove(student);
    }

    @Override
    public void removePerson(Faculty faculty) {
        this.faculties.remove(faculty);
    }

    @Override
    public void updatePerson(Student student) {
        // Implement the logic to update a student
    }

    @Override
    public void updatePerson(Faculty faculty) {
        // Implement the logic to update a faculty
    }

    @Override
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    @Override
    public void updateCourse(Course course) {
        // Implement the logic to update a course
    }

    @Override
    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    @Override
    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }

    @Override
    public void updateDepartment(Department department) {
        // Implement the logic to update a department
    }
}