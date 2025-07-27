package BTVN;

import java.util.Scanner;

public class Bai1 {
    static final String square = "Square";
    static final String triangle = "Triangle";
    static final String circle = "Circle";

    public static double areaSquare(double n){
        return n*n;
    }
    public static double areaTriangle(double x, double y){
        return (1/2)*x*y;
    }
    public static double areaCircle(double r){
        return 2*Math.PI*r;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập biến type: ");
        String a = sc.nextLine();
        double s;
        if(a.equalsIgnoreCase(square)){
            System.out.println("nhập độ dài cạnh hình vuông: ");
            double n = sc.nextDouble();
            s = areaSquare(n);
        }
        else if(a.equalsIgnoreCase(triangle)){
            System.out.println("nhập độ dài đáy: ");
            double x = sc.nextDouble();
            System.out.println("nhập độ dài chiều cao: ");
            double y = sc.nextDouble();
            s = areaTriangle(x,y);
        }
        else if(a.equalsIgnoreCase(circle)){
            System.out.println("nhập bán kính hình tròn: ");
            double r = sc.nextDouble();
            s = areaSquare(r);
        }
        else{
            System.out.println("Hình dạng không hợp lệ! ");
            return ;
        }
        System.out.println("Diện tích của viên gạch: "+s);
    }


}
