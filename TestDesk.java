package Assignment1;

import java.util.Scanner;

public class TestDesk {
    public static void main(String[] args) {

        Deck deck1 = new Deck(2);
        System.out.println("\n");
        for (int i = 0; i < 52 * 2; i++) {
            Card dealedCard = deck1.dealCard();
            if (dealedCard != null) {
                System.out.print(dealedCard.toString1() + " / " + "\n");
            }
        }
        System.out.println("\n");

        deck1.initializePack(2);
        deck1.shuffle();

        System.out.println("Shuffled deck of 2 packs:");
        for (int i = 0; i < 52 * 2; i++) {
            Card dealedCard = deck1.dealCard();
            System.out.print(dealedCard.toString1() + " / " + "\n");
        }
        System.out.println("\n");

        Deck deck2 = new Deck(1);

        for (int i = 0; i < 52; i++) {
            Card dealedCard = deck2.dealCard();
            if (dealedCard != null) {
                System.out.print(dealedCard.toString1() + " / " + "\n");
            }
        }
        deck2.initializePack(1);
        deck2.shuffle();

        System.out.println("Shuffled deck of 1 packs:");
        for (int i = 0; i < 52; i++) {
            Card dealedCard = deck2.dealCard();
            System.out.print(dealedCard.toString1() + " / " + "\n");
        }
        System.out.println("\n");

        Scanner input = new Scanner(System.in);
        System.out.print("How many hands? (1 - 10, please): ");
        int num = input.nextInt();

        Deck deck3 = new Deck(1);
        Hand[] hands = new Hand[num];

        for (int i = 0; i < num; i++) {
            hands[i] = new Hand();
        }

        System.out.println("Here are our hands, from unshuffled deck:");

        while (deck3.getTopCard() > 0) {
            for (int j = 0; j < num; j++) {
                Card dealedCard = deck3.dealCard();
                hands[j].takeCard(dealedCard);
            }
        }


        for (int i = 0; i < num; i++) {
            System.out.println(hands[i].toString2());

        }
        deck3.initializePack(1);
        deck3.shuffle();

        for (int i=0;i<num;i++) {
            hands[i]=new Hand();
        }

        System.out.println("\nHere are our hands, from SHUFFLED deck:");
        while (deck3.getTopCard() >= 0) {
            for (int i=0;i<num;i++) {
                Card dealedCard = deck3.dealCard();
                hands[i].takeCard(dealedCard);
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println( hands[i].toString2());
        }

    }
}



