import java.util.Objects;
import java.util.Scanner;

public class Neptune {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello astronauts!");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("The game will begin shortly...");
        Thread.sleep(2000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("Ready");
        Thread.sleep(500);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Space Travel Center. What's your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + "-- Welcome to the Neptune adventure game.");
        Thread.sleep(1000);
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        Thread.sleep(2000);
        System.out.println("They need someone to go to Neptune, and you've been chosen!");
        System.out.println();

        Thread.sleep(2000);
        System.out.println("Are you excited? Type Y or N");
        String excited = input.nextLine();
        System.out.println("I knew you'd say that. It's so cool that you're going to Neptune!");

        Thread.sleep(1000);
        System.out.println("It's time to pack for your trip");
        Thread.sleep(1000);
        System.out.println("How many suitcases do you plan to bring?");

        int suitcaseCount = Integer.parseInt(input.nextLine());
        if (suitcaseCount > 2) {
            System.out.println("That's way too many. You'll have to pack more lightly.");
            System.out.println("Please try and fit your things into 2 suitcases.");
        } else {
            System.out.println("That's a good number. You could bring up to 2 if you wanted.");
        }

        Thread.sleep(1000);
        System.out.println("""

                You're allowed to bring one companion animal with you.
                What kind of companion animal would you like to bring?""");
        String species = input.nextLine();
        System.out.println("What is your companion's name?");
        String petName = input.nextLine();
        System.out.println("Sweet! So you are bringing " + petName + " the " + species + ".");

        System.out.println("\nNASA has a interior design team offering to outfit your space ship.\n" +
                "You have a couple of options for the interior decor of your ship.");
        System.out.println("\nYour options are:\n" + " A  Sleek, modern minimalism\n" +
                " B  Retro/vintage space age\n" +
                " C  SF Hippie chic\n" + "Which decor would you like? Choose A, B, or C");

        String choice = input.nextLine().toUpperCase();
        if (Objects.equals(choice, "A")) {
            System.out.println("I can see it now:\n" + name + " and " + petName + " surfing the celestial abyss ...\nin a sleek, modern, minimalist spacecraft");
        } else if (Objects.equals(choice, "B")) {
            System.out.println("I can see it now:\n" + name + " and " + petName + " surfing the celestial abyss ...\nin a retro/vintage space-age spacecraft");
        } else if (Objects.equals(choice, "C")) {
            System.out.println("I can see it now:\n" + name + " and " + petName + " surfing the celestial abyss ...\nin a San Francisco hippie-chic spacecraft");
        } else {
            System.out.println("error");
        }

        System.out.println("\n" + name + "-- the day is here!\nYou crawl into the spaceship with" + petName +"\nBrace for take off!");
        Thread.sleep(2000);
        System.out.println("5...");
        Thread.sleep(1000);
        System.out.println("4...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("* LIFTOFF *");
    }
}