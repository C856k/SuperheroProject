import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println("Velcome to the superheroverse");
        System.out.println("1. add a new hero");
        System.out.println("9. end the program");
        Scanner scan = new Scanner(System.in);

        int menu;
        do {

            menu = scan.nextInt();
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
                scan.nextLine();
                System.out.println(" Superhero creation year: " + creationYear);

                database.createSuperhero(name, power, Strength, creationYear);
                System.out.println(" Superhero name: " + name + " Superhero power: " + power + " Superhero strength: " + Strength + " The year that the Superhero was created: " + creationYear);
                System.out.println("");
            } else if (menu == 9) {
                System.out.println("Program ended");


            }

        } while (menu!= 9) ;

    }
}
