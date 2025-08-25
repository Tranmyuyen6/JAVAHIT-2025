package Practice_in_class.Bai3.Yc5;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static double tinh(int a, int b){
        double kq = 0;
        try{
            kq = (double)a/b;
        } catch (Exception e) {
            System.out.println("phép tính bị ỗi khi chia cho 0");
        }
        return kq;
    }
    public static void main(String[] args){
        int a = 0, b = 0;
        boolean INT = false;


        while (!INT){
            try{
                System.out.println("nhập vào số nguyên a: ");
                a = sc.nextInt();
                INT = true;
            } catch (Exception e) {
                System.out.println("vui lòng nhập lại số nguyên");
                sc.nextLine();
            }
        }
        INT = false;
        while (!INT){
            try{
                System.out.println("nhập vào số nguyên b: ");
                b = sc.nextInt();
                if (b == 0) {
                    System.out.println("phép tính không họợp lệ ");
                }
                INT = true;
            }
            catch (Exception e) {
                System.out.println("vui lòng nhập lại số nguyên");
                sc.nextLine();
            }
        }
        double KQ = tinh(a,b);
        System.out.println(KQ);

    }
}
