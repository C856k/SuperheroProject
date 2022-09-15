public class Superhero {

    private String name;
    private String power;
    private String Strength;
    private int creationYear;
    private boolean human;


    public Superhero(String name, String power, String strength, int creationYear, boolean human) {
        this.human = human;
        this.name = name;
        this.power = power;
        this.Strength = strength;
        this.creationYear = creationYear;
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
    public boolean isHuman(){
        return human;
    }
}
