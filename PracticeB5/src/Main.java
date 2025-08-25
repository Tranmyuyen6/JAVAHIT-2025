import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Student studentA = new Student("my", 21, 8.5, 6.6, 10.0);
        double dtb = (double)(studentA.getTx1()+studentA.getTx2()+ studentA.getGk()*2)/4;
        System.out.println(studentA.getName()+"  "+dtb);

        ArrayList<Student> studentList =
    }
}