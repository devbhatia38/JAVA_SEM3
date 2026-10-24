import java.util.Scanner;

enum Coin {
    ONE, TWO, FIVE, TEN
}

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("15 rupees required to purchase a packet of chips.");

        int required = 15;
        String product = "Packet of Chips";
        int total = 0;

        while (total < required) {
            System.out.println("\nInsert Coin (ONE, TWO, FIVE, TEN)");
            String input = sc.next().toUpperCase();

            Coin coin = Coin.valueOf(input);

            switch (coin) {
                case ONE:
                    total += 1;
                    System.out.println("Rs.1 inserted successfully.");
                    break;
                case TWO:
                    total += 2;
                    System.out.println("Rs.2 inserted successfully.");
                    break;
                case FIVE:
                    total += 5;
                    System.out.println("Rs.5 inserted successfully.");
                    break;
                case TEN:
                    total += 10;
                    System.out.println("Rs.10 inserted successfully.");
                    break;
            }

            System.out.println("Total Paid : Rs." + total);

            if (total < required) {
                System.out.println("Pay More : Rs." + (required - total));
            }
        }

        System.out.println("\nTransaction Complete ");
        System.out.println(product + " Dispensed Successfully!");
        System.out.println("Total Paid : Rs." + total);

        if (total > required) {
            System.out.println("Change Returned : Rs." + (total - required));
        }

        System.out.println("Thank You For Using Vending Machine...!");
    }
}