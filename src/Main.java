class Student {
    String name = "Manya";
    int id = 18;

    void display() {
        System.out.println(name);
        System.out.println(id);
    }
}
interface Employ {
    void EmpInfo();
}

interface EmpSalary {
    void SalaryInfo();

}
class St{
    String name ;
    int rollno;
    public void display(String name,int rollno){
        
    }
}
class InheritanceEx implements Employ,EmpSalary {
    String name;
    int age;
    double salary;

    InheritanceEx(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public void EmpInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void SalaryInfo() {
        System.out.println("Salary: " + salary);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Student obj = new Student();
       obj.display();
    }
}