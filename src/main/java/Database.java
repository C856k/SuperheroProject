import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();


    public void createSuperhero(String name, String power, String strength, int creationYear, boolean human) {
        Superhero hero = new Superhero(name, power, strength, creationYear, human);
        superheroes.add(hero);
    }
    public Superhero searchFor(String searchTerm) {
        for (Superhero hero : superheroes) {
            if (hero.getName().equals(searchTerm)) {

                return hero;
            }
        }
        return null;
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }
}




