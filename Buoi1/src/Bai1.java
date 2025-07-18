import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String ten=sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int tuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập chiều cao: ");
        float chieuCao= sc.nextFloat();
        System.out.println("Xin chào "+ten+", bạn "+tuoi+" tuổi và cao "+chieuCao+" mét.");

    }
}
