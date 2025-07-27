package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static boolean palindrome(String a){
        String b = "";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        boolean madam = a.equalsIgnoreCase(b);
        return madam;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi từ bàn phím: ");
        String a = sc.nextLine();
        if(palindrome(a)){
            String c = a.toUpperCase();
            System.out.println(c);
            System.out.println("chuỗi này đối xứng!");
        }
        else{
            System.out.println(a);
            System.out.println("chuỗi này không đối xứng!");
        }

    }
}
