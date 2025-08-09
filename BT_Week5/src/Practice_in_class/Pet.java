package Practice_in_class;

public class Pet {
    private String name;
    private double weight;
    private String species;

    public Pet(){

    }
    public Pet(String name, double weight, String species){
            this.name = name;
            this.weight = weight;
            this.species = species;
    }


    public String getName(){
            return name;
    }
    public void setName(String name){
            this.name = name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }


    public void printInfo(){
        System.out.printf("%-15s | %-10.2f | %-10s\n",name,weight,species);
    }
    public boolean isOverweight(){
        if(this.getWeight()>10)
            return true;
        return false;
    }
    public String getBasicInfo(){
        return name+" - "+species;
    }


}
