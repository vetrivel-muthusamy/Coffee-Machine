package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*
        //System.out.println("Hello World!");
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " of coffee you will need:");
        System.out.println(200 * cups + " ml of water");
        System.out.println(50 * cups + " ml of milk");
        System.out.println(15 * cups + " g of coffee beans");
    }
}
