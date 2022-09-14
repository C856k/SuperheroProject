import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println("Velcome to the superheroverse");
        System.out.println("1. add a new hero");
        System.out.println("2. see the list over all superheroes");
        System.out.println("9. end the program");
        Scanner scan = new Scanner(System.in);

        int menu;
        do {

            menu = scan.nextInt();
            scan.nextLine();
            if (menu == 1) {
                System.out.println("What is the name of the Superhero?: ");
                String name = scan.next();
                scan.nextLine();
                System.out.println("Superhero name: " + name);

                System.out.println("What is the hero's power?: ");
                String power = scan.nextLine();
                scan.nextLine();
                System.out.println(" Superhero power: " + power);

                System.out.println("How powerful is the hero?: ");
                String Strength = scan.nextLine();
                scan.nextLine();
                System.out.println(" Superhero strength: " + Strength);

                System.out.println("In what year was the hero created?: ");
                int creationYear = scan.nextInt();
                System.out.println(" Superhero creation year: " + creationYear);

                System.out.println("Is the Superhero a human?");
                boolean human = scan.nextBoolean();

                database.createSuperhero(name, power, Strength, creationYear, human);
                System.out.println(" Superhero name:\n " + name + " Superhero power:\n " + power + " Superhero strength:\n " + Strength + " The year that the Superhero was created:\n " + creationYear
                        + " Is the hero a human?:\n " + human);
                System.out.println("The hero has now been added to the database!");

            } else if (menu == 2) {
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
            }else if (menu == 3){
                System.out.println("Type the name of the hero you want to find");
            } else if (menu == 9) {
                System.out.println("Program ended and you can now close the program");


            }

        } while (menu != 9);

    }
}
