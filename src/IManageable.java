public interface IManageable {
    void addPerson(Student student);
    void addPerson(Faculty faculty);
    void removePerson(Student student);
    void removePerson(Faculty faculty);
    void updatePerson(Student student);
    void updatePerson(Faculty faculty);
    void addCourse(Course course);
    void removeCourse(Course course);
    void updateCourse(Course course);
    void addDepartment(Department department);
    void removeDepartment(Department department);
    void updateDepartment(Department department);
}