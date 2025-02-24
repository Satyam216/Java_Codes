class Department {
    private String name;
    public Department(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private Department department;

    public Professor(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showDetails() {
        if (department != null) {
            System.out.println(name + " works in " + department.getName() + " department.");
        } else {
            System.out.println(name + " is not assigned to any department.");
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");
        Professor john = new Professor("John");

        john.setDepartment(cs); // Assigning dynamically
        john.showDetails();

        john.setDepartment(math); // Changing relationship
        john.showDetails();
    }
}
