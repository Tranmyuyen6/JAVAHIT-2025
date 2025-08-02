package Homework.Bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> b = new ArrayList<>();

    public static void newSinhVien(){
        System.out.println("tên sinh viên mơis: ");
        String name = sc.nextLine();
        System.out.println("năm sinh: ");
        int birth = sc.nextInt();
        sc.nextLine();
        System.out.println("địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("điểm tx1: ");
        int score_tx1 = sc.nextInt();
        System.out.println("điểm tx2: ");
        int score_tx2 = sc.nextInt();
        System.out.println("điểm KTHP: ");
        int score_KTHP = sc.nextInt();
        System.out.println("số tiết nghỉ: ");
        int lesson_miss = sc.nextInt();

        b.add(new Student(name, birth, address, score_tx1, score_tx2, score_KTHP, lesson_miss));
    }

    public static void suaThongTin(){
        System.out.println("nhập sinh viên cần sửa thông tin: ");
        String sinhVien = sc.nextLine();
        for(Student c : b){
            if(c.getName().equalsIgnoreCase(sinhVien)){
                System.out.println("nhập thông tin mới:");
                System.out.println("năm sinh: ");
                c.setBirth(sc.nextInt());
                sc.nextLine();
                System.out.println("địa chỉ: ");
                c.setAddress(sc.nextLine());
                System.out.println("điểm tx1: ");
                c.setScore_tx1(sc.nextInt());
                System.out.println("điểm tx2: ");
                c.setScore_tx2(sc.nextInt());
                System.out.println("điểm KTHP: ");
                c.setScore_KTHP(sc.nextInt());
                System.out.println("số tiết nghỉ: ");
                c.setLesson_miss(sc.nextInt());
                return;
            }

        }
        System.out.println("không timf thấy sinh viên");
    }

    public static void danhSach() {
        System.out.printf("tên \t\t tuổi \t địa chỉ \t điểm TX1 \t điểm TX2 \t điểm KTHP \t điểm GPA \t\t số tiết nghỉ\n");
        for (Student c : b) {
            System.out.print(c);
        }
    }
    public static void sxTuoi(){
        b.sort(Comparator.comparing(Student::getAge));
        danhSach();
    }
    public static void sxGPA(){
        b.sort(Comparator.comparing(Student::getScoreGPA));
        danhSach();
    }
    public static void sxTietNghi(){
        b.sort(Comparator.comparing(Student::getLesson_miss));
        danhSach();
    }
    public static void xoaSinhVien(){
        System.out.println("nhập sinh viên cần xóa:");
        String name = sc.nextLine();
        boolean d = b.removeIf(b->b.getName().equalsIgnoreCase(name));
        if(d)
            System.out.println("đã xóa sinh viên");
        else
            System.out.println("không tìm thấy sinh vieen");
    }


    public static void main(String[] args){
        Student[] a = new Student[5];
        a[0] = new Student("Nguyễn Văn A",2000,"Hà Nội",7,5,10,2);
        a[1] = new Student("Nguyễn Văn B",2001,"Hải Phòng",6,8,9,0);
        a[2] = new Student("Nguyễn Văn C",2002,"Vĩnh Phúc",8,7,6,0);
        a[3] = new Student("Nguyễn Văn D",2003,"Kiên Giang",8,9,8,3);
        a[4] = new Student("Nguyễn Văn E",2004,"Cà Mau",10,8,8,1);

        System.out.printf("tên \t\t tuổi \t địa chỉ \t điểm TX1 \t điểm TX2 \t điểm KTHP \t điểm GPA \t\t số tiết nghỉ\n" );
        for(Student b : a){
            System.out.printf("%s \t %d \t %s \t\t %d \t\t %d \t\t %d \t\t %.1f \t\t %d \t \n" ,b.getName(), b.getBirth(), b.getAddress(), b.getScore_tx1(), b.getScore_tx2(), b.getScore_KTHP(), b.getScoreGPA(), b.getLesson_miss());

        }
        System.out.println("-------quản lí sinh viên---------");
        System.out.println("hãy chọn chức năng:");
        System.out.println("1.Thêm sinh viên mới");
        System.out.println("2.Sửa thông tin sinh viên");
        System.out.println("3.Sắp xếp sinh viên theo tuổi");
        System.out.println("4.Sắp xếp sinh viên theo GPA");
        System.out.println("5.Sắp xếp sinh viên theo số tiết nghỉ");
        System.out.println("6.Xóa sinh viên khỏi danh sách ");

        Collections.addAll(b, a);



        int chonSo = sc.nextInt();
        sc.nextLine();
        switch(chonSo){
            case 1 -> newSinhVien();
            case 2 -> suaThongTin();
            case 3 -> sxTuoi();
            case 4 -> sxGPA();
            case 5 -> sxTietNghi();
            case 6 -> xoaSinhVien();
            default -> System.out.println("không có chức năng này");
        }

    }


}
