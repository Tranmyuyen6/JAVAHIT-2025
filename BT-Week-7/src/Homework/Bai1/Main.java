package Homework.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi kí tự: ");
        String a = sc.nextLine();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length();i++){
            char b = a.charAt(i);
            if(b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U'){
                sum1++;
            }
            if(Character.isUpperCase(b)){
                sum2++;
            }
        }
        System.out.println("số kí tự nguyên âm: "+sum1);
        System.out.println("số kí tự in hoa: "+sum2);
    }
}
