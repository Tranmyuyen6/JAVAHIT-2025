package Homework.Bai1;

import java.util.Scanner;

public class Main {


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

    }

}
