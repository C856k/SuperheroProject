import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();


    public void createSuperhero(String name, String power, String strength, int creationYear, boolean human) {
        Superhero hero = new Superhero(name, power, strength, creationYear, human);
        superheroes.add(hero);
    }
    public ArrayList<Superhero> heroSearch(String searchTerm) {
        ArrayList<Superhero> heroSearch = new ArrayList<>();
        for (Superhero hero : superheroes) {
            if (hero.getName().equals(searchTerm)) {
                heroSearch.add(hero);
            }
        }

        return heroSearch;
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }
}




