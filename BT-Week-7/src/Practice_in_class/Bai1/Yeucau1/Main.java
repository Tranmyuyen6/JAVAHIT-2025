package Practice_in_class.Bai1.Yeucau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Shape[] shape = new Shape[5] ;
        shape[0]= new Circle();
        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle(3.4);
        Rectangle rectangle = new Rectangle(3, 4);
        shapeList.add(circle);
        shapeList.add(rectangle);
        for(Shape a : shapeList){
            System.out.println(a.area());
        }
        System.out.println();

    }
}
