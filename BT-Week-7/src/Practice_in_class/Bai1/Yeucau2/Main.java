package Practice_in_class.Bai1.Yeucau2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Movable> movable = new ArrayList<>();
        movable.add(new Car());
        movable.add(new Bike());
        for(Movable m : movable){
            m.move();
        }

    }
}
