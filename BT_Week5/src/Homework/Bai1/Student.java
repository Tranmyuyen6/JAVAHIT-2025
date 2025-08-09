package Homework.Bai1;

import java.util.Scanner;

public class Student {
    private String nameStudent;
    private String classStudent;
    private double scoreStudent;
    private Faculty y;

    public Student(){
        y = new Faculty();
    }
    public Student(String nameStudent, String classStudent, double scoreStudent, Faculty y) {
        this.nameStudent = nameStudent;
        this.classStudent = classStudent;
        this.scoreStudent = scoreStudent;
        this.y = y;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public double getScoreStudent() {
        return scoreStudent;
    }

    public void setScoreStudent(double scoreStudent) {
        this.scoreStudent = scoreStudent;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sinh viên: " );
        nameStudent = sc.nextLine();
        System.out.println("nhập lớp: ");
        classStudent = sc.nextLine();
        System.out.println("nhập điểm: ");
        scoreStudent = sc.nextDouble();
        sc.nextLine();
        y.Input();

    }
    public void Output(){
        System.out.printf(" %-15s  %-20s  %-8s  ", nameStudent, classStudent, scoreStudent);
        y.Output();
    }
}
