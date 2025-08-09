package Homework.Bai1;

import java.util.Scanner;

public class Faculty {
    private String nameFaculty;
    private String dateFaculty;
    private School x;

    public Faculty(){
        x = new School();
    }

    public Faculty(String nameFaculty, String dateFaculty, School x) {
        this.nameFaculty = nameFaculty;
        this.dateFaculty = dateFaculty;
        this.x = x;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getDateFaculty() {
        return dateFaculty;
    }

    public void setDateFaculty(String dateFaculty) {
        this.dateFaculty = dateFaculty;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên trường: ");
        x.setNameSchool(sc.nextLine());
        System.out.println("nhập ngày vào trường: ");
        x.setDateSchool(sc.nextLine());

        System.out.println("nhập tên khoa: ");
        nameFaculty = sc.nextLine();
        System.out.println("nhập ngày vào khoa: ");
        dateFaculty = sc.nextLine();


    }
    public void Output(){
        System.out.printf(" %-22s  %-14s  %-15s  %-20s \n",nameFaculty, dateFaculty, x.getNameSchool(), x.getDateSchool());

    }
}
