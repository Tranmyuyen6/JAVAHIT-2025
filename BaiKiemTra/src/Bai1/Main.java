package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi kí tự: ");
        String chuoi = sc.nextLine();
        boolean oneTime = true;

        int sum = 0;
        for(int i=0;i<chuoi.length();i++){
            char a = chuoi.charAt(i);
            if(a == a){
                oneTime = false;
            }
            if(a == ' ' ){
                sum++;
            }
        }
        System.out.println(oneTime);
        System.out.println("số kí tự khoảng trắng: "+sum);
        for(int i=chuoi.length()-1;i>=0;i--){
            char a = chuoi.charAt(i);
            System.out.print(a);
        }

    }
}
