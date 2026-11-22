class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " +salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name,double salary,String department){
        /* super() calls the constructor of the parent class (Employee).
        It is used because name and salary are declared and initialized in Employee,
        so Employee's constructor must set them for the Manager object.
        Without it, Java tries to call Employee's no-argument constructor,
        which does not exist, so a compile error occurs.
        It must be the first line because the parent part of the object
        has to be created before the child part (department).*/
        super(name,salary);
        this.department=department;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
public class EmployeeSystem {
    public static void main(String[] args){
        Employee e=new Employee("Tae",55000.0);
        System.out.println();
        Manager m=new Manager("Hania",50000.0,"Computer Science");
        System.out.println();
        System.out.println("---Employee Details---");
        e.displayDetails();
        System.out.println();
        System.out.println("---Manager Details---");
        m.displayDetails();
    }
}
