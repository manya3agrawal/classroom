package probelms;
class Employee{
    private String name;
    private int id;
    private String department;
    private int salary;
    static final String companyName = "Tech Solutions";
    //static String companyName;
    static int employeeCount ;

    Employee(String name, int id, int salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        employeeCount++;
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int getid(){
        return id;
    }
    public String getdepartment(){
        return department;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, 45000, "IT");
        Employee e2 = new Employee("Neha", 102, 55000, "HR");
        System.out.println(e1.getName());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Company: " + Employee.companyName);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}
