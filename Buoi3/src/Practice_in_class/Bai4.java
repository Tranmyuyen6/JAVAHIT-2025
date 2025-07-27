package Practice_in_class;

import java.util.Scanner;

public class Bai4 {
    public static int fibonacci(int n) {
        int f0 = 0, f1 = 1;
        if(n==0) return 0;
        if(n==1) return 1;
        int fn=0;
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("dãy fibonacci từ 0 đến "+n+": ");
        int fi;
        int sum=0;
        for(int i=0;i<=n;i++){
            fi=fibonacci(i);
            System.out.println(fi+" ");
            if(fi%2!=0)
                sum+=fi;
        }
        System.out.println(" tổng các số Fibonacci lẻ trong dãy: "+sum);
    }

}
