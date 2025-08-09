package Practice_in_class;

import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> petList = new ArrayList<>();
    private int currentPetCount;
    static int totalCages;
    final int MAX_CAPACITY = 3;

    public Cage() {
    }

    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.petList = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages +=1;
    }

    public Cage(String cageCode, ArrayList<Pet> petList, int currentPetCount) {
        this.cageCode = cageCode;
        this.petList = petList;
        this.currentPetCount = currentPetCount;
        totalCages +=1;
    }

    public void addPet(Pet pet){
        if(currentPetCount < MAX_CAPACITY){
            petList.add(pet);
            currentPetCount++;
        }
    }

    public void printAllPets(){
        System.out.println();
        System.out.println("lồng "+ cageCode);
        for (Pet pet : petList){
            pet.printInfo();
        }
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

}
