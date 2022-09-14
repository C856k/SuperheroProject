import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createTestData(){
        createSuperhero("Batman","money","weak",1965,true);
        createSuperhero("Superman","Super Strength","Powerful",1964,false);
        createSuperhero("Aquaman","Water","Strong",1954,false);
    }

    public void createSuperhero(String name, String power, String strength, int creationYear, boolean human) {
        Superhero hero = new Superhero(name, power, strength, creationYear,human);
        superheroes.add(hero);
    }


    public Superhero searchFor(String searchTerm){
        for (Superhero hero : superheroes)
        hero.getName().toLowerCase().contains(searchTerm.toLowerCase());
        return searchFor(searchTerm);
    }



    public ArrayList<Superhero> getAllSuperheroes(){
        return superheroes;
    }
}

