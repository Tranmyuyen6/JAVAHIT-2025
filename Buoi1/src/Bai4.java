import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("nhập các phần tử trong mảng: ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        int t=0;
        for(int i=0;i<5;i++){
            t+=a[i];
        }
        int maxx=a[0];
        for(int i=1;i<5;i++) {
            if (a[i] > maxx) {
                maxx=a[i];
            }
        }
        System.out.print("các phần tử trong mảng: ");
        for(int i=0;i<5;i++){
            System.out.printf(a[i]+" ");
        }
        System.out.println();
        System.out.println("tổng các phần tử: "+t);
        System.out.println("giá trị lớn nhất trong mảng: "+maxx);
    }
}
