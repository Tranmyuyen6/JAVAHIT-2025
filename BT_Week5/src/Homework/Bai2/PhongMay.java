package Homework.Bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private Integer n;

    public PhongMay(){
        x = new QuanLy();
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, Integer n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.println("nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("nhập diện tích: ");
        dienTich = sc.nextDouble();
        x.Nhap();
        System.out.println("nhập số lượng máy tính: ");
        n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for(int i=0;i<n;i++){
            y[i] = new May();
            y[i].Nhap();
        }
    }
    public void Xuat(){
        for(int i=0;i<n;i++){
            System.out.printf("%-10s %-10s %-10.2f %-10s %-15s %-10s %-10s %-20s\n",maPhong, tenPhong, dienTich, x.getMaQL(), x.getHoTen(), y[i].getMaMay(), y[i].getTenMay(), y[i].getTinhTrang());
        }
    }
}
