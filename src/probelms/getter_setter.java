package probelms;
class Stu{
    private String name;
    private int id;
    private int salary;
    private String department;
    Stu(String name, int id, int salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    public void setdepartment(String department){
        this.department = department;
    }
    public String getname(){
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
        Stu obj = new Stu("Manya",18,4000000,"CSE AIML");
        //set details
        obj.setname("Manya");
        obj.setid(1);
        obj.setsalary(4000000);
        obj.setdepartment("CSE AIML");
       //get details
        System.out.println(obj.getname());
        System.out.println(obj.getSalary());
        System.out.println(obj.getdepartment());
        System.out.println(obj.getid());
    }
}
