public class Address {
    private String diaChi;
    private int soNha;

    public Address(){

    }
    public Address(String diaChi, int soNha){
        this.diaChi = diaChi;
        this.soNha = soNha;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public int getSoNha(){
        return soNha;
    }
    public void setSoNha(int soNha){
        this.soNha = soNha;
    }
}
