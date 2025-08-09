package Homework.Bai2;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May(){

    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.println("nhập tên máy: ");
        tenMay = sc.nextLine();
        System.out.println("nhập tình trạng máy: ");
        tinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-10s %-10s %-20s \n", maMay, tenMay, tinhTrang);
    }
}
