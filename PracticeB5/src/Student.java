public class Student {
    private String name;
    private int age;
    static int dem;
    private double tx1;
    private double tx2;
    private double gk;
    Address address;

    public Student(){

    }
    public Student(String name, int age,double tx1, double tx2, double gk){
        this.name = name;
        this.age = age;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.gk = gk;
        dem+=1;
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
    public double getTx1(){
        return tx1;
    }
    public void setTx1(double tx1){
        this.tx1 = tx1;
    }
    public double getTx2(){
        return tx2;
    }
    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }
    public double getGk(){
        return gk;
    }
    public void setGk(double tx2) {
        this.gk = gk;
    }

}
