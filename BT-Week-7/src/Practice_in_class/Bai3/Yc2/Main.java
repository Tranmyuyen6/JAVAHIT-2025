package Practice_in_class.Bai3.Yc2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args ){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for(Animal a : animals){
            a.makeSound();
        }
    }
}
