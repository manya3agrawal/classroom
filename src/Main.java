class Student{
    String name = "Manya";
    int id = 18;
    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Student obj = new Student();
       obj.display();
    }
}