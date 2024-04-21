public class Student {
    private String name;
    private int age;
    private int id;
    private double gpa;

    public Student(String name, int age, int id, double gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", ID: " + id + ", GPA: " + gpa);
    }
}