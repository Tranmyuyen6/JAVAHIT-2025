package Practice_in_class;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String a = sc.nextLine();
        String b = a.trim();
        System.out.println("Xoá các khoảng trắng ở đầu và cuối chuỗi: "+b);
        String c="";
        for(int i=b.length()-1;i>=0;i--){
            c+=b.charAt(i);
        }
        boolean madam = b.equalsIgnoreCase(c);
        System.out.println("chuỗi là palindrome: "+madam);
    }
}
