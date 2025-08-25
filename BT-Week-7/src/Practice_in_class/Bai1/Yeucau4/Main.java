package Practice_in_class.Bai1.Yeucau4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static  double tinh(int a, int b){
        double kq = 0;
        try {
            return kq = (double)a/b;
        }
        catch (Exception e){
            if(b == 0){
                System.out.println("phép tính ko hợp lệ");
                return 0;
            }
        }

        return kq;
    }

    public  static void main(String[] args){
        int a = 0,b = 0;
        boolean INT = false;

        while (!INT) {
            try {
                System.out.println("nhập số nguyên a: ");
                a = sc.nextInt();
                INT = true;
            } catch (Exception e) {
                System.out.println("vui lòng nhập lại số nguyên");
                sc.nextLine();
            }
        }
        INT = false;
        while (!INT) {
            try {
                System.out.println("nhập số nguyên b: ");
                b = sc.nextInt();
                INT = true;
            } catch (Exception e) {
                System.out.println("vui lòng nhập lại số nguyên");
                sc.nextLine();
            }
        }
            double kq = tinh(a, b);
            System.out.println("a / b = " + kq);
        
    }
}
