package Practice_in_class.Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();

        quanLyNhanVien.themNhanVien(new NhanVienFullTime("F001", "anh", 20, "ds@gmail.com", "018372", 4543523,242400));
        quanLyNhanVien.themNhanVien(new NhanVienFullTime("F002", "ánh", 21, "ds@gmail.com", "018372", 2000000, 230000));
        quanLyNhanVien.themNhanVien(new NhanVienPartTime("P001", "ảnh", 22, "ds@gmail.com", "018372", 20, 20000));
        quanLyNhanVien.themNhanVien(new NhanVienPartTime("P002", "ạnh", 23, "ds@gmail.com", "018372", 34, 23000));


        System.out.println("danh sách nhân viên: ");
        System.out.println();
        System.out.printf("%-15s %-10s %-10s %-15s %-10s %-15s %-10s\n" ,"mã nv", "tên", "tuổi", "email", "sđt", "lương","loại");
        for(NhanVien nv : quanLyNhanVien.getDanhSachNhanVien()){
            nv.hienThiThongTin();
        }

        System.out.println("tổng quỹ lương: ");
        System.out.println(quanLyNhanVien.tinhTongLuong());
    }
}
