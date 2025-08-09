package Homework.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin 1 phòng máy");
        PhongMay a = new PhongMay();
        a.Nhap();
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s %-10s %-20s \n", "mã phòng", "tên phòng", "diện tích", "mã quản lí", "họ tên", "mã máy", "tên máy", "tình trạng");
        a.Xuat();
    }
}
