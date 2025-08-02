package Practice_in_class.Bai2;

public class Main {
    public static void main(String[] args){
        Student a = new Student();
        a.setName("tony");
        a.setAge(99);
        a.getName();
        a.getAge();
        System.out.println("tôi tên là "+a.getName()+", năm nay "+ a.getAge()+" tuổi");
    }
}
