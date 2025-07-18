import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số nguyên thứ nhất: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập số nguyên thứ hai: ");
        int b=sc.nextInt();
        sc.nextLine();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        float thuong=(float)a/b;
        int chiaDu=a%b;
        System.out.println("tổng:"+tong);
        System.out.println("hiệu:"+hieu);
        System.out.println("tích:"+tich);
        System.out.println("thương:"+thuong);
        System.out.println("chia lấy dư:"+chiaDu);
        System.out.println((a==b)?"2 số bằng nhau":"2 số không bằng nhau");
    }
}
