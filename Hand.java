package Assignment1;

public class Hand {
    public static final int MAX_CARDS = 30;
    private Card[] myCards;
    private int numCards;

    public Hand() {
        myCards = new Card[MAX_CARDS];
        numCards = 0;

    }

    public void resetHand() {
        for (int i = 0; i < numCards; i++) {
            myCards[i] = null;
        }
        numCards = 0;
    }


    public boolean takeCard(Card card) {
        if (numCards >= MAX_CARDS)
            return false;

        System.out.println("print something"+card.getCardError());
        if (card != null && !card.getCardError()) {
            myCards[numCards] = card;
            numCards++;

        }return true;


    }

    public Card playCard() {
        if (numCards > 0) {
            Card playedCard = myCards[numCards - 1];
            myCards[numCards - 1] = null;
            numCards--;
            return playedCard;
        } else {
            return null;
        }

    }


//    public Card inspectCard(int k) {
//        Card card = new Card();
//        try {
//            if (k >= 0 && k < MAX_CARDS && myCards[k] != null) {
//                System.out.println("Inside if condition");
//                card = new Card(myCards[k].getValue(), myCards[k].getSuit());
//            } else {
//                System.out.println("Inside else condition");
//
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("[Invalid index] ");
//            return null;
//        }
//        return card;
//    }

//    public String toString2() {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < MAX_CARDS; i++) {
//            result.append(myCards[i].toString()).append(", ");
//        }
//        return "Hand = ( " + result.toString() + ")";
//    }

    public int getNumCards() {
        return numCards;
    }

    public Card inspectCard(int k) {
        System.out.println("** legal **"+getNumCards());

        if (k >= 0 && k < getNumCards()) {
            return myCards[k];
        } else {
            System.out.println("** illegal **");
            return null;
        }
    }


//    public String toString2() {
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < MAX_CARDS; i++) {
//            if (myCards[i] != null) {
//                string.append(myCards[i].toString()).append('\n');
//            }
//        }
//        return string.toString();
//    }


//    public String toString2() {
//        String hand = "";
//        for (int i = 0; i < numCards; i++) {
//            Card card = new Card();
//            if (card.getCardError() == false) {
//                hand += myCards[i] + " ";
//            } else {
//                hand = "Invalid";
//            }
//        }
//        return hand;
//    }
public String toString2() {
        String handStr = "Hand: ";

        for (int k = 0; k < numCards; k++)
            handStr += myCards[k].toString1() + " \n";
        return handStr;
    }
}




