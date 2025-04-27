import java.util.Random;

/**
 * A deck of playing cards (of fixed length).
 */
public class Deck {

    // This is a class variable so we don't have to create
    // a new Random object every time we call randomInt.
    private static Random random = new Random();

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (all null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("below are the cards in the deck:\n");

        for (int i = 0; i < cards.length; i++) {
          sb.append(cards[i]);


        if (i < cards.length - 1) {
          sb.append("\n");
        }
      }


        return sb.toString();
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
      
        for (int i = cards.length - 1; i > 0; i--) {
            int j = randomInt(0, i);
            swapCards(i, j);
        }
    }
    /**
     * Chooses a random number between low and high, including both.
     */
    private static int randomInt(int low, int high) {
      int range = high - low + 1;

      int randomInRange = random.nextInt(range);

      return low + randomInRange;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    private void swapCards(int i, int j) {
        Card temp = cards[i];

        cards[i] = cards[j];

        cards[j] = temp;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
      
        for  (int i = 0; i < cards.length - 1; i++) {
            int lowestIndex = indexLowest(i, cards.length-1);
            
            swapCards(i, lowestIndex);       
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    private int indexLowest(int low, int high) {
      int lowestIndex = low;
      
      for (int i = low + 1; i <= high; i++) {
          int compareValue = cards[i].compareTo(cards[lowestIndex]);
          if (compareValue == -1) {
          lowestIndex = i;
          }
      }
      
      return lowestIndex;
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    private static Deck merge(Deck d1, Deck d2) {
        Deck result = new Deck(d1.getCards().length + d2.getCards().length);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < d1.getCards().length && j < d2.getCards().length) {
            int lowestValue = d1.getCards()[i].compareTo(d2.getCards()[j]);
            
            if (lowestValue == -1) {
                result.getCards()[k] = d1.getCards()[i];
                i++;
                k++;
            }
            else {
                result.getCards()[k] = d2.getCards()[j];
                k++;
                j++;
            }

        }
        while (i < d1.getCards().length) {
            result.getCards()[k] = d1.getCards()[i];
            i++;
            k++;
        }
        
        while (j < d2.getCards().length) {
            result.getCards()[k] = d2.getCards()[j];
            j++;
            k++;
        }

        return result;
    }

    /**
     * Returns a sorted copy of the deck using selection sort.
     */
    public Deck almostMergeSort() {
        Deck deck1 = subdeck(0, 25);
        Deck deck2 = subdeck(26, 51);
        
        deck1.selectionSort();
        deck2.selectionSort();

        Deck result = merge(deck1, deck2);
        return result;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
        if (this.cards.length <= 1) {
            return this;
        }

        int mid = this.cards.length / 2;

        Deck deck1 = this.subdeck(0, mid - 1);
        Deck deck2 = this.subdeck(mid, this.cards.length - 1);
        
        deck1 = deck1.mergeSort();
        deck2 = deck2.mergeSort();

        return merge(deck1, deck2);
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        // start from the second card (index 1)
        for (int i = 1; i < cards.length; i++) {
            Card current = cards[i];
            // insert the current card into its proper position
            insert(current, i);
        }
    }

    /**
     * Helper method for insertion sort.
     */
    private void insert(Card card, int i) {
        // i is the position where the card should be inserted
        // Start at position i and move the card backward until it's in the right position
        int j = i;
        // Keep moving backward as long as we haven't reached the beginning
        // and the current card is less than the one before it
        while (j > 0 && card.compareTo(cards[j-1]) == -1) {
            // Shift the card at j-1 one position to the right
            cards[j] = cards[j-1];
            j--;
        }
        // Place the card in its correct position
        cards[j] = card;
      

    }

    
    public static void main(String[] args) {
      Deck deck = new Deck();
      // Print out the results
      //System.out.println(deck);

      //int random = randomInt(40, 52);
      //System.out.println(random);

      //deck.swapCards(1,15);
      //System.out.println(deck);
    
      deck.shuffle();
     
      //int lowestIndex = deck.indexLowest(1,20);
      //System.out.println(lowestIndex + "\n" + deck);
      System.out.println(deck);
      //deck.selectionSort();
      //System.out.println(deck);
        
      //Deck sortedDeck = deck.almostMergeSort();
      //System.out.println(sortedDeck);
      deck.insertionSort();
      System.out.println(deck);

    }
}
