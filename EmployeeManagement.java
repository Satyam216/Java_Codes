class Employee{
    int employee_ID;
    String name;
    int salary;    
}
//full time employee details

class FullTimeEmployee extends Employee{
    int benifit;
    int bonus;
        public void compensation1(){
            int total_salary = salary + benifit + bonus;
            System.out.println("Details of First Employee : Full Time Employee");
            System.out.println("Employee_ID : " + employee_ID);
            System.out.println("Name : " + name);
            System.out.println("Salary : "+ salary);
            System.out.println("Benifi_Amount : " + benifit);
            System.out.println("Bonus_Amount : " + bonus);
            System.out.println("Total salary of employee 1 : " + total_salary);
        }
}

//part tiem employee details

 class PartTimeEmployee extends Employee {
    double working_hours;
    int hour_rate;
        public void compensation2(){
             System.out.println("Details of Second Employee : Part time Employee");
            System.out.println("Employee_ID : " + employee_ID);
            System.out.println("Name : " + name);
            System.out.println("Working Hour : " + working_hours);
            System.out.println("Per Hour Rate : " + hour_rate);
            double total = working_hours * hour_rate;
            System.out.println("Total salary of employee 2 : " + total);
        }
}

public class EmployeeManagement{
    public static void main(String args[]){
        FullTimeEmployee fe = new FullTimeEmployee();
        fe.employee_ID = 1;
        fe.name = "Satyam";
        fe.salary = 20000;
        fe.benifit = 1000;
        fe.bonus = 1500;
        fe.compensation1();

        System.out.println();

        PartTimeEmployee pe = new PartTimeEmployee();
        pe.employee_ID = 2;
        pe.name = "Kunal";
        pe.salary = 20000;
        pe.working_hours = 6.5; //hours
        pe.hour_rate = 1500;
        pe.compensation2();
    }
}