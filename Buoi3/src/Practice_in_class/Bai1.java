package Practice_in_class;

import java.util.Scanner;

public class Bai1 {
    static boolean snt(int x){
        if(x<=2) return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng phần tử: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        int chan=0;
        int le=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                chan+=a[i];
            else
                le+=a[i];
        }
        System.out.println("tổng các số chẵn: "+chan);
        System.out.println("tổng các số lẻ: "+le);
        int t=0;
        for(int i=0;i<n;i++){
            if(snt(a[i]))
                t++;
        }
        System.out.println("Số lượng số nguyên tố trong mảng: "+t);
    }

}
