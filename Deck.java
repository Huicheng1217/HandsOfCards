package Assignment1;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    private final int MAX_PACKS=6;
    private final int NUM_CARDS_PER_PACK=52;
    private final int MAX_CARDS_PER_DECK=MAX_PACKS*NUM_CARDS_PER_PACK;

    private static Card[] masterPack=new Card[52];
    private Card[] cards;
    int topCard;
    int numPacks;

    Deck(){
        this(1);
    }
    Deck(int numPacks){
        allocateMasterPack();
        initializePack(numPacks);

    }
    public static void allocateMasterPack(){
        if(masterPack[0]!=null) {
            return;
        }
            int index=0;
            for(CardIdentity.Suit suit : CardIdentity.Suit.values()){
                for(char value='2';value<='9';value++){
                    masterPack[index++]=new Card(value,suit);
                }
                masterPack[index++]=new Card('T', suit);
                masterPack[index++]=new Card('J', suit);
                masterPack[index++]=new Card('Q', suit);
                masterPack[index++]=new Card('K', suit);
                masterPack[index++]=new Card('A', suit);
            }
        }

    public boolean initializePack(int numPacks) {
        if (numPacks < 1 || numPacks > MAX_PACKS) {
            return false;
        } else {
            this.numPacks = numPacks;
            int indexCards = numPacks * NUM_CARDS_PER_PACK;
            cards = new Card[indexCards];

            for (int i = 0; i < indexCards; i++) {
                cards[i] = masterPack[i % 52];
            }topCard=indexCards-1;
            return true;
        }
    }
    public void shuffle(){
        Random num=new Random();
        for(int i=topCard;i>0;i--){
            int j=num.nextInt(i+1);
            Card temp = cards[i];
            cards[j]=temp;
            cards[i]=cards[j];
        }
    }


    public Card dealCard() {
        if (topCard >= 0 ) {
            Card dealedCard = cards[topCard];
            cards[topCard] = null;
            topCard--;
            return dealedCard;
        } else {
            return null;
        }
    }

    public int getTopCard(){
        return topCard;
    }
    public Card inspectCard(int k) {
        try {
            return cards[k];
        } catch (ArrayIndexOutOfBoundsException e) {
            return new Card('X', CardIdentity.Suit.clubs); // Card with cardError = true
        }
    }
}
