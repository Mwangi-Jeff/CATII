// Person abstract class
abstract class Person {
    protected String name;
    protected int age;
    protected int ID;

    public Person(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayInfo();
}
