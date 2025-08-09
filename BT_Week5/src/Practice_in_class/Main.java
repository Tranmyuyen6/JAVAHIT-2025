package Practice_in_class;

public class Main {
    static Pet pet = new Pet();

    public static void main(String[] args) {

        Cage cage1 = new Cage("l1");
        cage1.addPet(new Pet("husky", 14, "chó"));
        cage1.addPet(new Pet("mèo ba tư", 7, "mèo"));


        Cage cage2 = new Cage("l2");
        cage2.addPet(new Pet("hổ mang chúa", 20, "rắn"));
        cage2.addPet(new Pet("đại bàng", 10, "chim"));
        cage2.addPet(new Pet("doraemon", 129.3, "mèo"));

        System.out.println("-------");
        System.out.println("số lồng đã tạo: "+ Cage.getTotalCages());
        System.out.println("-------");
        System.out.println("Danh sách thú trong từng lồng");
        cage1.printAllPets();
        cage2.printAllPets();

        System.out.println("-------");
        System.out.println("Danh sách thú nặng hơn 10kg");
        for (Pet petWeight1 : cage1.getPetList()){
            if(petWeight1.isOverweight())
                petWeight1.printInfo();
        }
        for (Pet petWeight2 : cage2.getPetList()){
            if(petWeight2.isOverweight())
                petWeight2.printInfo();
        }
    }
}
