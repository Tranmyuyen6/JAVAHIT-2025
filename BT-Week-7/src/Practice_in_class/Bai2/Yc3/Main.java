package Practice_in_class.Bai2.Yc3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args ){

    Person a  = new Person("ánh", 13, new Address("trần hưng đạo", "hà nội"));
    Person b = new Person("hạnh", 14, new Address("trần quốc toản", "hà nội"));
    Person c = new Person("mạnh", 15, new Address("võ văn tần", "phủ lý"));

    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());




    }
}

