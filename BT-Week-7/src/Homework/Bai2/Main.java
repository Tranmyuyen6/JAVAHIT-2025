package Homework.Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("sv001","hoàng anh",8.4,18,"anh123@gmail.edu","cntt","ha noi"));
        students.add(new Student("sv002","nguyễn mạnh",3.5,15,"manh123@gmail.edu","10a7","ha noi"));

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-20s %-15s %-15s\n","id","tên","điểm","loại","tuổi","email","tên lớp","điịa chỉ");
        for(Student s : students){
            s.displayInfo();
        }

    }
}
