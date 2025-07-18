import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float r;
        do {
            System.out.println("nhập bán kính: ");
            r = sc.nextFloat();
        }
        while(r<0 || r>1000);
        float cv1=(float)(2*3.14*r);
        String cv= String.format("%.3f",cv1);
        float dt1 =(float)(3.14*r*r);
        String dt=String.format("%.3f",dt1);
        System.out.println(cv+" "+ dt);

    }
}
