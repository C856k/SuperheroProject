import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void createSuperhero() {
        Database database = new Database();

        database.createSuperhero("Superman", "Clark Kent", "Superhuman strength","Extremely strong", 1938,false);

        ArrayList<Superhero> results = database.getAllSuperheroes();

        int expectedDBSize = 1;
        int actualSize = results.size();
        assertEquals(expectedDBSize, actualSize);
    }

    @Test
    void heroSearchOneResult() {
      //  Database database = new Database();

        //database.createSuperhero("Superman","Clark","Superhuman strength","Extremely strong",1938,false);
        ArrayList<Superhero> results = database.heroSearch("Superman");

        int actualSize = results.size();
        int expectedSize = 1;
        assertEquals(actualSize, expectedSize);
    }
    private Database database;


    @BeforeEach
    void prepareTest(){
        database = new Database();
        database.createTestData();

    }

    @Test
    void heroSearchNoResult() {

        ArrayList<Superhero> results = database.heroSearch("Bojack Horseman");

        int actualSize = results.size();
        int expectedSize = 0;
        assertEquals(actualSize, expectedSize);
    }

    @Test
    void heroSearchMultipleResult(){

        ArrayList<Superhero> results = database.heroSearch("man");

        int actualSize = results.size();
        int expectedSize = 3;
        assertEquals(expectedSize,actualSize);
    }

    @Test
    void deleteSuperhero(){

        ArrayList<Superhero> results = database.getAllSuperheroes();
        Superhero superhero = results.get(0);
        boolean acualtResult = database.deleteSuperhero(superhero);

        boolean expectedResult = true;
        assertEquals(acualtResult, expectedResult);

        int expectedSize = results.size() -1;
        ArrayList<Superhero> resultsAfterDelete = database.getAllSuperheroes();
        int actualSize = resultsAfterDelete.size();


        assertEquals(expectedSize,actualSize);
    }
}