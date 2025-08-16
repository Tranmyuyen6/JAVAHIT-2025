package Practice_in_class.Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args ){
        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(new SinhVien("2023834383", "lophoc1",8.4, new LopHoc("231", "java")));
        sv.add(new SinhVien("2023458383", "lophoc2",7, new LopHoc("231", "java")));
        sv.add(new SinhVien("2023866383", "lophoc3",7.9, new LopHoc("231", "java")));
        sv.add(new SinhVien("2023878383", "lophoc4",9.1, new LopHoc("231", "java")));

        System.out.printf("%-12s %-15s %-10s %-10s %-10s\n", "mã sinh viên", "họ tên", "điểm tb", "mã lớp", "tên lớp");

        for(int i=0;i<sv.size();i++){
            sv.get(i).inThongTin();
        }
        System.out.println("sinh viên có điểm cao nhất: ");
        SinhVien svmax = sv.get(0);
        for(SinhVien diem : sv){
            if(diem.getDiemTB() > svmax.getDiemTB())
                svmax = diem;
        }
        svmax.inThongTin();
    }
}
