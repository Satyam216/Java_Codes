class Employee{
    String name ;
    int id;
    double basic_salary;
    double gross_salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.basic_salary = salary;
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+id);
        System.out.println("Basic Salary : " + salary);
    }
    public void grossSalary(){
        gross_salary = basic_salary + (.2 * basic_salary) + (.5 * basic_salary);
        System.out.println("Gross Salary : "+ gross_salary);
    }

    public void netSalary(){
        int deduction = 25000;
        double net_salary = gross_salary . deduction;
        System.out.println("Net Salary : " + net_salary);
    }
}

public class EmpSalaryCal{
    public static void main(String args[]){
        Employee emp = new Employee("Satyam",1,100000);
        emp.grossSalary();
        emp.netSalary();
    }
}