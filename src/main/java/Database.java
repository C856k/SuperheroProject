import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();


    public void createSuperhero(String name, String realName, String power, String strength, int creationYear, boolean human) {
        Superhero hero = new Superhero(name, realName, power, strength, creationYear, human);
        superheroes.add(hero);
    }
    public void createTestData(){
        createSuperhero("Batman", "bruce Wayne", "Rich","Weak",1939,true);
        createSuperhero("Superman","Clark kent","Superhuman Strength","Exremely",1938,false);
        createSuperhero("Spider-man","Peter Parker","Spider power","Fairly strong",1975,true);
    }
    public ArrayList<Superhero> heroSearch(String searchTerm) {
        ArrayList<Superhero> heroSearch = new ArrayList<>();
        for (Superhero hero : superheroes) {
            if (hero.getName().contains(searchTerm.toLowerCase())) {
                heroSearch.add(hero);
            }
        }

        return heroSearch;
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    public boolean deleteSuperhero(Superhero superhero) {
        boolean success = true;
        return success;
    }
}




