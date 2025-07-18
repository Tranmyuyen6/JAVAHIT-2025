public class Bai5 {
    public  static void main(String[] args){
        System.out.println("bảng cửu chương");
        int t=1;
        for(int i=1;i<=10;i++){
            t=5*i;
            System.out.println("5x"+i+"="+t);
        }
        int d1=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                d1+=i;
            }
        }
        System.out.println("tổng các số chẵn bằng for:"+d1);
        int d2=0;
        int j=2;
        while(j<=100){
            d2+=j;
            j+=2;
        }
        System.out.println("tổng các số chẵn bằng while:"+d2);
    }
}
