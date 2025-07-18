import java.util.Scanner;

public class Bai2_File2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập số lượng phần tử: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            sc.nextLine();
        }
        int[] b=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                int l=(i-1>=0)?a[i-1]:0;
                int r=(i+1<n)?a[i+1]:0;
                t=Math.abs(l-r);
                b[i]=a[i]+t;
            }
            else {
                b[i]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }

    }
}
