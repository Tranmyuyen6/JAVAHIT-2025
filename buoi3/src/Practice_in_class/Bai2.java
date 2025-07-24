
import java.util.Scanner;

public class Baitap {
    static final double PI = 3.14159265;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap r:");
        double r = sc.nextDouble();
        System.out.println("nhap k:");
        int k = sc.nextInt();
        sc.nextLine();
        double chuVi = 2*PI*r;
        System.out.println("chu vi: "+chuVi);
        double a=Math.pow(r,k);
        System.out.println("r mũ k: "+a);
        double b=Math.sqrt(r+k);
        System.out.println("Căn bậc hai của (r + k): "+b);
        double c=Math.abs(r-k);
        System.out.println("giá trị tuyệt đối của (r-k): "+c);

    }



}
