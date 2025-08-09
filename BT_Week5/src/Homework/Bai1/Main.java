package Homework.Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] a = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("nhập siinh viên thứ "+ (i+1));
            a[i] = new Student();
            a[i].input();
        }
        System.out.printf(" %-15s  %-20s  %-8s  %-22s  %-14s  %-15s  %-20s \n", "tên sinh viên", "lớp", "điểm", "khoa", "ngày vào khoa", "tên trường", "ngày vào trường");
        System.out.println();
        for(Student s : a){
            s.Output();
        }
    }
}
