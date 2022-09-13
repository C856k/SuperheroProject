import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createSuperhero(String name, String power, String strength, int creationYear) {
        Superhero hero = new Superhero(name, power, strength, creationYear);
        superheroes.add(hero);
    }
}

