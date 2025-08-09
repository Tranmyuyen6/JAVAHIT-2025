package Homework.Bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy(){

    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã quản lí: ");
        maQL = sc.nextLine();
        System.out.println("nhập họ tên: ");
        hoTen = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-10s %-15s ", maQL, hoTen);
    }
}
