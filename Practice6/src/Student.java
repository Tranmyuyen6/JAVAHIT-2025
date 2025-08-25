public class Student extends Person{
    private String school;
    private int studentCode;

    public Student(){

    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;

    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void graduate(boolean isGraduate){
        if(isGraduate)
            System.out.println("đ tốt nghiệp");
        else System.out.println("chua tot nghiep");
    }
    public void eat(){
        System.out.println(getName() + " đã ăn");
    }
}
