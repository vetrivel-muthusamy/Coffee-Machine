package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        //Stage 1/6: Hello, coffee!
        /*
        //System.out.println("Hello World!");
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        //Stage 2/6: Machines have needs
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " of coffee you will need:");
        System.out.println(200 * cups + " ml of water");
        System.out.println(50 * cups + " ml of milk");
        System.out.println(15 * cups + " g of coffee beans");*/

        //Stage 3/6: Enough coffee for everyone
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int waterCups = water / 200;
        int milkCups = milk / 50;
        int beansCups = beans / 15;

        int limit = Math.min(waterCups, Math.min(milkCups, beansCups));

        if (cups > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");
        } else if (cups == limit) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = limit - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }

    }
}
