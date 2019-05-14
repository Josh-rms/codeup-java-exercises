import java.util.Hashtable;
import java.util.Scanner;
import java.util.Random;
public class AdventureGame {
        Hashtable <String, Integer> stats = new Hashtable<>();
        String ready;
        String Name;
        String attack;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        sc.useDelimiter("\n");
        AdventureGame player = new AdventureGame();

        System.out.println("Welcome Hero! \uD83E\uDDD9\u200D What is your name?");
        String name = sc.next();
        System.out.println("Pleasure to meet you " + name + "! " + "\uD83E\uDDDD\u200D️ "  + "Your starting stats are...");
        int randomNum = rand.nextInt(20);

        player.stats.put("Health \uD83D\uDEE1️️", 100);
        player.stats.put("Attack ⚔️" , randomNum);
        player.stats.put("Potions(+10hp) \uD83E\uDDEA", 3);

        System.out.println(player.stats);

        player.ready = promptUser("Are you ready hero?(y/n)\n", true);

        AdventureGame enemy = new AdventureGame();
        enemy.Name = "Giant Dragon \uD83D\uDC09";
        System.out.println(enemy.Name + " has appeared!");
        enemy.stats.put("Health ❤️", 100);
        enemy.stats.put("Attack \uD83D\uDD25", 20);
        System.out.println(enemy.stats);

        player.attack = promptUser("What would you like to do?\n", true);
    }
    private static String promptUser(String prompt, boolean ask) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String result;
        if (ask) {
            System.out.print(">️ ");
            result = sc.next();
        } else {
            result = "";
        }
        return result;
    }
}
