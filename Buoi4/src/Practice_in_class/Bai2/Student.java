package Practice_in_class.Bai2;

public class Student {
    private String name = "uyn";
    private int age = 19;

    public void Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
