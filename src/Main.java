public class Main {
    public static void main(String[] args) {
        // Create a Management instance
        Management management = new Management();

        try {
            // Create a sample student
            Student student = new Student("John Doe", 20, 1001, 3.5);
            if (student.getGpa() < 0) {
                throw new InvalidGpaException("GPA cannot be negative.");
            }
            management.addPerson(student);
            System.out.println("Added student: " + student.getName());

            // Create a sample faculty member
            Faculty faculty = new Faculty("SCES", 45, 2001, "Computer Science");
            management.addPerson(faculty);
            System.out.println("Added faculty: " + faculty.getName());

            // Create a sample course
            Course course = new Course("Introduction to Java", "CS101");
            if (!course.getCode().matches("^[A-Z]{2}[0-9]{3}$")) {
                throw new InvalidCourseCodeException("Invalid course code.");
            }
            management.addCourse(course);
            System.out.println("Added course: " + course.getName());

            // Assign faculty to the course
            course.assignFaculty(faculty);
            System.out.println("Assigned faculty to course: " + course.getName());

            // Create a sample department
            Department department = new Department("Computer Science");
            management.addDepartment(department);
            System.out.println("Added department: " + department.getName());

        } catch (InvalidGpaException | InvalidCourseCodeException e) {
            e.printStackTrace();
        }
    }
}