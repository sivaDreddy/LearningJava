package Collections;

public class Organisation {
    public static void main(String[] args) {
 System.out.println("Employee Details:");
Employee emp=new Employee(1,"Siva",120000.00);
emp.displayDetails();
System.out.println("Manager Details:");
Manager man=new Manager(2,"ramesh",200000.00,"Manager");
man.displayDetails();

    }
}
