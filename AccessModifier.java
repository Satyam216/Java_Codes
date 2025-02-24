class Person {
    // Private fields
    private String name;
    private int age;

    // Public constructor to initialize private fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Private method
    private void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Public method that calls the private method
    public void showInfo() {
        displayInfo();
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        // Create an object of Person
        Person person = new Person("Alice", 25);

        // Access private fields via public getters and setters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(30);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Call a public method that internally calls a private method
        person.showInfo();

        // Uncommenting the next line will cause a compilation error
        // person.displayInfo(); // Cannot access private method
    }
}
