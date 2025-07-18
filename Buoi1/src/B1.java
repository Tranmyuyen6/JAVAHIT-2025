import java.util.Scanner;

public class B1{

    public static void stichhop(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    /***
     * asdfg
     * @param a
     * @param b
     * @return
     */
    public static int bienDoi(int a,int b){
        int sum1= a+b;
        return sum1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap a: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.printf("nhap b: ");
        int b=sc.nextInt();
        sc.nextLine();
        stichhop(a,b);
        double sum1=(double) bienDoi(a,b);
        System.out.println(sum1);
    }

}


