package Bai2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Manufacture> manufactures = new ArrayList<>();
        manufactures.add(new Manufacture("id1","chim cánh cụt", "hà nội", "canhcut@gmail.vn"));
        manufactures.add(new Manufacture("id2","chim sẻ", "phú thọ", "canhcut@gmail.vn"));
        manufactures.add(new Manufacture("id3","chim đại bàng", "hà nội", "canhcut@gmail.vn"));
        manufactures.add(new Manufacture("id4","hổ", "hòa bình", "canhcut@gmail.vn"));
        manufactures.add(new Manufacture("id5","sư tủ", "hà nội", "canhcut@gmail.vn"));

        System.out.println("----QUAẢN LÍ SẢN PHẨM----");
        System.out.println("1.thêm sp");
        System.out.println("2.sửa thông tin sp");
        System.out.println("3.xóa sp theo id");
        System.out.println("4.tìm sp theo tên");
        System.out.println("5.in danh sách sp");
        System.out.println();

    }
}
