package Homework.Bai1;

public class Student {
    private String name;
    private int birth;
    private String address;
    private int score_tx1;
    private int score_tx2;
    private int score_KTHP;
    private int lesson_miss;

    public Student(){

    }
    public Student(String name, int birth, String address, int score_tx1, int score_tx2, int score_KTHP, int lesson_miss){
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.score_tx1 = score_tx1;
        this.score_tx2 = score_tx2;
        this.score_KTHP = score_KTHP;
        this.lesson_miss = lesson_miss;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBirth(){
        return birth;
    }
    public void setBirth(int birth){
        this.birth = birth;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getScore_tx1(){
        return score_tx1;
    }
    public void setScore_tx1(int score_tx1){
        this.score_tx1 = score_tx1;
    }

    public int getScore_tx2(){
        return score_tx2;
    }
    public void setScore_tx2(int score_tx2){
        this.score_tx2 = score_tx2;
    }

    public int getScore_KTHP(){
        return score_KTHP;
    }
    public void setScore_KTHP(int score_KTHP){
        this.score_KTHP = score_KTHP;
    }

    public int getLesson_miss(){
        return lesson_miss;
    }
    public void setLesson_miss(int lesson_miss){
        this.lesson_miss = lesson_miss;
    }
    public int getAge(){
        return 2025-birth;
    }
    public double getScoreGPA(){
        return score_tx1*0.2+score_tx2*0.3+score_KTHP*0.5;
    }

}
