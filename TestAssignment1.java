package Assignment1;

public class TestAssignment1 {
    public static void main(String args[]) {
        Card card1 = new Card();
        Card card2 = new Card('K', CardIdentity.Suit.spades);
        Card card3 = new Card('X', CardIdentity.Suit.diamonds);

        System.out.println(card1.toString1());
        System.out.println(card2.toString1());
        System.out.println(card3.toString1());
        System.out.println();

        card1.set('B', CardIdentity.Suit.clubs);
        card2.set('K', CardIdentity.Suit.spades);
        card3.set('3', CardIdentity.Suit.hearts);
        System.out.println(card1.toString1());
        System.out.println(card2.toString1());
        System.out.println(card3.toString1());

        Hand myHand = new Hand();
        Card card4 = new Card('Q', CardIdentity.Suit.spades);
        Card card5 = new Card('2', CardIdentity.Suit.diamonds);
        Card card6 = new Card('A', CardIdentity.Suit.hearts);
        Card card7 = new Card('W', CardIdentity.Suit.clubs);
//        while (myHand.takeCard(card4) &&
//                myHand.takeCard(card5) &&
//                myHand.takeCard(card6) &&
//                myHand.takeCard(card7)) ;
//
//        System.out.println("Player's hand: " + '\n' + myHand.toString2());
//        System.out.println();

        while (myHand.takeCard(card4) && myHand.takeCard(card5) && myHand.takeCard(card6) && myHand.takeCard(card7))
        
        System.out.println("/* -------------------------------------------------------------------------------");
        System.out.println("Hand full");
        System.out.println("After deal");
        System.out.println(myHand.toString2());
        System.out.println("");

        System.out.println("\nPlaying:");

        Card playedCard;
        while ((playedCard = myHand.playCard()) != null) {
            System.out.println(playedCard.toString1());
        }

        System.out.println("Testing inspectCard()");

        Card inspectedCard1 = myHand.inspectCard(1);
        if (inspectedCard1 != null) {
            System.out.println(inspectedCard1.toString1());
        }

        Card inspectedCard2 = myHand.inspectCard(2);
        if (inspectedCard2 != null) {
            System.out.println(inspectedCard2.toString1());
        }
    }
}










