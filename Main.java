import java.awt.print.Book;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Boiler boiler = new Boiler();
    static CollectionOfEggs collectionOfEggs = new CollectionOfEggs();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Add egg: 1.");
            System.out.println("Remove egg: 2.");
            System.out.println("Boil eggs: 3.");
            System.out.println("Check eggs: 4.");
            System.out.println("Stop boiling eggs: 5.");

            int selected = scanner.nextInt();

            switch (selected) {
                case 1:
                    collectionOfEggs.addEgg(new Egg());
                    break;
                case 2:
                    collectionOfEggs.removeEgg();
                    break;
                case 3:
                    boilEggs();
                    System.out.println("Eggs are now boiling");
                    break;
                case 4:
                    System.out.println(boiler.areEggsReady());
                    break;
                case 5:
                    boiler.stopBoiling();
            }

        }
    }

        private static void boilEggs() {
            System.out.println("How do you want your eggs?");

            System.out.println("Rare: 1");
            System.out.println("Medium: 2");
            System.out.println("Well done: 3");

            var number = scanner.nextInt();

            switch (number) {
                case 1:
                    boiler.startBoiling(10);
                    System.out.println("Eggs are gonna be done in 10 mins");
                    break;
                case 2:
                    boiler.startBoiling(15);
                    System.out.println("Eggs are gonna be done in 15 mins");
                    break;
                case 3:
                    boiler.startBoiling(20);
                    System.out.println("Eggs are gonna be done in 20 mins");
                    break;

            }
        }
    }
