package Practice_in_class.Bai2.Yc2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("sv1","kiều anh", 20));
        students.add(new Student("sv2","kiều linh", 21));
        students.add(new Student("sv3","hoàng anh", 22));
        students.add(new Student("sv4","minh anh", 23));

        System.out.printf("%-20s %-25s %-10s\n", "ID", "Tên SV", "Tuổi");
        for(Student s : students){
            s.printInfo();
        }
    }
}
