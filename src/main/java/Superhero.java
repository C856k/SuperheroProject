public class Superhero {

    private String name;
    private String power;
    private String Strength;
    private int creationYear;


    public Superhero(String name, String power, String strength, int creationYear) {
        this.name = name;
        this.power = power;
        this.Strength = strength;
        this.creationYear = creationYear;
    }
    public String toString(){
        String Superhero = this.name + "" + this.power + "" + this.Strength + "" + this.creationYear;
        System.out.println(Superhero);
        return Superhero;


    }

    public String getName(){
        return name;
    }
    public String getPower(){
        return power;
    }
    public String getStrength(){
        return Strength;
    }
    public int getCreationYear(){
        return creationYear;
    }
}
