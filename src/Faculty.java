public class Faculty {
    private String name;
    private int age;
    private int id;
    private String department;

    public Faculty(String name, int age, int id, String department) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.department = department;
    }
    public String getName() {
        return this.name;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + name + ", Age: " + age + ", ID: " + id + ", Department: " + department);
    }
}