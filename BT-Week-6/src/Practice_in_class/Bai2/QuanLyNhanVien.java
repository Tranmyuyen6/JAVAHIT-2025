package Practice_in_class.Bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien(){
        danhSachNhanVien = new ArrayList<>();
    }
    public QuanLyNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(ArrayList<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    public void themNhanVien(NhanVien nv){
        danhSachNhanVien.add(nv);
    }
   public void hienThiTatCa(){
       for(NhanVien nv : danhSachNhanVien){
           System.out.printf("%-15s %-10s %-10s %-15s %-10s %-10s %-15s\n",nv.getMaNV(),nv.getTen(),nv.getTuoi(), nv.getEmail(), nv.getSoDienThoai(), nv.tinhLuong());
        }
    }



    public double tinhTongLuong(){
        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien){
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }
}
