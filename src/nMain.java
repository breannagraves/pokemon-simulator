import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class nMain {
    static Scanner scanner = new Scanner(System.in);
    static String userName;
    static String pkmName;
    static String userChoice;
    static String[] pokedex = { "Charmander", "Eevee", "Lucario", "Mr. Mime", "Pikachu", "Psyduck", "Squirtle" };
    static String rivalMon;

    static void Battle(nPlayer P1, nPlayer Rival) {

        int counter = 0;

        System.out.println("BATTLE! ");
        System.out.println("Rival sent out: " + Rival.team.get(0).name);
        System.out.println("You sent out: " + P1.team.get(0).name);
        System.out.println(P1.team.get(0).name + " used: " + P1.team.get(0).getMvName(0) + " and dealt "
                + P1.team.get(0).getMvAtk(0) + " damage");
      //  Rival.team.get(0).healthvalue2 = Rival.team.get(0).gethealthTotal()-P1.team.get(0).getMvAtk(0);
     // healthvalue2 = Rival.team.get(0).gethealthLeft();
      //  System.out.println(Rival.team.get(0).name + " has " +Rival.team.get(0).gethealthLeft())
     // System.out.println(Rival.team.get(0).name + " has "+healthvalue2);

    }

    static void Heal(nPlayer P1) {

        System.out.println("in Heal");

        for (int i = 0; i < P1.team.size(); i++) {

            P1.team.get(i).remHealth = P1.team.get(i).tHealth;
        }

    }
    
    static void addPokemon(nPlayer P1) {

        String newMon;
        System.out.println();
        System.out.println("Name the Pokemon you want to add : ");
        newMon = scanner.nextLine();

        P1.addPoke(newMon);
    }

    static void displayTeam(nPlayer P1) {
        System.out.println("Your Team: ");
        for (int i = 0; i < P1.team.size(); i++) {

            System.out.println(
                    P1.team.get(i).name + " - Health: " + P1.team.get(i).remHealth + "/" + P1.team.get(i).tHealth);
        }

    }

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(pokedex.length);

        // Sample logic for creating a player and assinging it a pokemon.

        rivalMon = pokedex[n];

        // INIT RIVAL
        nPlayer Rival = new nPlayer("Blue", null);
        Rival.addPoke(rivalMon);

        System.out.println("Rival Mon: " + Rival.team.get(0).name);

        System.out.println("Welcome to Pokemon Battle Sim!");
        System.out.println("Please Enter Your Name: ");
        userName = scanner.nextLine();

        nPlayer P1 = new nPlayer(userName, null);
        System.out.println("Hello " + P1.pName + "! Please enter the name of your first Pokemon! ");
        pkmName = scanner.nextLine();

        P1.addPoke(pkmName);

        System.out.println("Congrats! Your fist Pokemon is: " + P1.team.get(0).name);
        System.out.println(P1.team.get(0).name + " has " + P1.team.get(0).tHealth + " remaining health.");

        // Example
        // P1.team.get(0).addMove("Ember");
        // System.out.println(
        // P1.team.get(0).name + " used: " + P1.team.get(0).getMvName() + ". Dealt " +
        // P1.team.get(0).getMv1Atk()
        // + " damage.");

        // Ask user what they want to do next
        do {
            if (userChoice == "EXIT") {
                break;
            }

            System.out.println("Trainer " + P1.pName
                    + ", What would you like to do next? (Battle, Heal, addPokemon, displayTeam, or EXIT)");
            userChoice = scanner.nextLine();

            switch (userChoice) {

                case "Battle":
                    Battle(P1, Rival);
                    break;

                case "Heal":
                    Heal(P1);
                    break;

                case "addPokemon":
                    addPokemon(P1);
                    break;

                case "displayTeam":
                    displayTeam(P1);
                    break;

                default:
                    break;
            }
        } while (!userChoice.equals("EXIT"));

        System.out.println("Back in main");

        // team1 = P1.getTeam();

        // System.out.println(P1.team.get(0).tHealth);

        // Create Pokemon after creating player 1

        // PokeLoader loader = new PokeLoader();

        // nPokemon pkm1 = loader.createMon("Charmander");
        // pkm1.displayMon();

        // nPokemon pkm3 = loader.createMon("Pikachu");
        // pkm3.displayMon();

        // System.out.println("My pokemon is: " + pkm1.getName()

        // create some battle logic here

    }

}
