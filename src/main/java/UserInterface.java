import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Scanner scan = new Scanner(System.in);
    Database database = new Database();

    public void startMenu() {
        int menu;
        do {
            System.out.println("Welcome to the superheroverse");
            System.out.println("1. add a new hero");
            System.out.println("2. see the list over all superheroes");
            System.out.println("3. search for a certain hero");
            System.out.println("9. end the program");
            menu = scan.nextInt();
            scan.nextLine();
            if (menu == 1) {
                addHero();
            } else if (menu == 2) {
                listOfHeroes();
            } else if (menu == 3) {
                heroSearch();
            } else if (menu == 4) {
                editHero();
            } else if (menu == 5) {
                deleteSuperhero();
            } else if (menu == 9) {
                System.exit(0);
            }
        } while (menu != 9);


    }

    public void addHero() {
        try {
            System.out.println("What is the name of the Superhero?: ");
            String name = scan.next();
            scan.nextLine();
            System.out.println("Superhero name: " + name);
            System.out.println("What is the hero's real name?: ");
            String realName = scan.next();
            scan.nextLine();
            System.out.println("Hero's real name: " + realName);
            System.out.println("What is the hero's power?: ");
            String power = scan.nextLine();
            scan.nextLine();
            System.out.println("Superhero power: " + power);

            System.out.println("How powerful is the hero?: ");
            String Strength = scan.nextLine();
            scan.nextLine();
            System.out.println("Superhero strength: " + Strength);

            System.out.println("In what year was the hero created?: ");
            int creationYear = scan.nextInt();
            System.out.println("Superhero creation year: " + creationYear);

            System.out.println("Is the Superhero a human?");
            boolean human = scan.nextBoolean();

            database.createSuperhero(name, realName, power, Strength, creationYear, human);
            System.out.println(" Superhero name:\n " + name + " Superhero power:\n " + power + " Superhero strength:\n " + Strength + " The year that the Superhero was created:\n " + creationYear
                    + " Is the hero a human?:\n " + human);
            System.out.println("The hero has now been added to the database!");
        } catch (Exception e) {
            System.out.println("There is a typo in the information that you ");
        }

    }

    public void listOfHeroes() {
        for (Superhero superhero : database.getAllSuperheroes()) {
            System.out.println("Name: " + superhero.getName());
            System.out.println("Power: " + superhero.getPower());
            System.out.println("Strength: " + superhero.getStrength());
            System.out.println("Creation year" + superhero.getCreationYear());
            if (superhero.isHuman()) {
                System.out.println("is it a human: yes");
            } else {
                System.out.println("is it a human: no");
            }

        }

    }

    public void editHero() {
        System.out.println("Type the name of the hero you want to edit:");
        String searchTerm = scan.next();
        scan.nextLine();
        ArrayList<Superhero> searchResult = new ArrayList<>();
        for (Superhero hero : database.getAllSuperheroes()) {
            if (hero.getName().contains(hero.getName())) {
                searchResult.add(hero);
                System.out.println(hero);
            }
        }
        if (!searchResult.isEmpty()) {
            System.out.println("No hero found");
        } else {
            System.out.println("Hero found");
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(((i) + 1) + ")" + searchResult.get((i)));
            }
            System.out.println("Choose a hero");
            int number = scan.nextInt();
            scan.nextLine();
            Superhero hero = searchResult.get(number - 1);

            System.out.println("Type the new superhero or press enter to keep the current info");
            String Name = scan.nextLine();

            if (!Name.isEmpty()) {
                hero.setName();
            }
            System.out.println("Type a new name or press enter");
            String realName = scan.nextLine();

            if (!realName.isEmpty()) {
                hero.setRealName();
            }
            System.out.println("Type the new superpower or press enter");
            String superPower = scan.nextLine();

            if (!superPower.isEmpty()) {
                hero.setSuperPower();
            }
            System.out.println("Type the creation year of your superhero");
            boolean writtingError = false;
            do {
                try {
                    String newCreationYear = scan.nextLine();
                    if (!newCreationYear.isEmpty()) {
                        hero.setCreationYear(Integer.parseInt(newCreationYear));
                        writtingError = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("An error happened, please try again");
                    scan.nextLine();
                    writtingError = true;
                }

                System.out.println("The new edited hero: " + hero);
            } while (writtingError == true);
        }
    }

    public void heroSearch() {

        System.out.println("Type the name of the hero you want to find");
        String searchTerm = scan.next();
        ArrayList<Superhero> searchResult = database.heroSearch(searchTerm);

        if (searchResult.isEmpty()) {
            System.out.println("No results found");
        } else {
            System.out.println("Superhero found");
            for (Superhero superhero : searchResult) {
                System.out.println("Hero name: " + superhero.getName() + "\n" + "Hero's real name: " + superhero.getRealName() + "\n" + "Hero power: " + superhero.getPower() + "\n" + "Hero strength: " + superhero.getStrength() + "\n" + "In what year was the hero created?: " + superhero.getCreationYear() + "\n" + "" + superhero.isHuman());
            }
        }

    }

    public void deleteSuperhero() {
        System.out.println("Type the name of the hero you want to delete");
        String searchTerm = scan.next();
        ArrayList<Superhero> searchResult = database.heroSearch(searchTerm);
        if (!searchResult.isEmpty()) {
            System.out.println("No results found");
        } else {
            System.out.println("Superhero found");
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println((i) + 1 + ")" + searchResult.get(i));
            }
            System.out.println("Choose a hero");
            int number = scan.nextInt();
            scan.nextLine();
            Superhero hero = searchResult.get(number - 1);

            System.out.println("Do you want to erase this superhero? (True/False: " + hero);
            boolean delete = scan.nextBoolean();
            if (delete == true) {
                database.deleteSuperhero(hero);
                System.out.println("Erasing the superhero...");
            } else if (delete == false) {
                System.out.println("Doesnt erase the superhero" + hero);
            }

        }

    }

}


