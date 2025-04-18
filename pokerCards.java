public class pokerCards {
  
  // Instance variables
    private final int rank; // 2, 3, 4, 5, 6, 7, 8, 9, 10, j, q, k, ace
    private final int suit; // spades, jacks, clubs, diamonds

  public static final String[] RANKS = {
      null, "Ace", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"};
    
    // Constructor with parameters
    public pokerCards(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
      return this.rank;
    }
    
    public int getSuit() {
      return this.suit;
    }

    // print tile method
    public static void printTile(pokerCards pokerCards) {
        System.out.print(pokerCards.rank);
        System.out.print(pokerCards.suit);
    }
    
    // Method to display time in a readable format
    public String toString() {
      return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public boolean equals(pokerCards that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    public int compareTo(pokerCards that) {
       
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (that.rank == 1) {
            return -1;
        }
        if (this.rank == 1) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public static pokerCards[] makeDeck() {
      pokerCards[] deck = new pokerCards[52];
      int index = 0;
      for (int suit = 0; suit <= 3; suit++) {
          for (int rank = 1; rank <= 13; rank++) {
              deck[index] = new pokerCards(rank, suit);
              index++;
            }
        }
      return deck;
    }
      
    // Main method with your original code plus test for increment()
    public static void main(String[] args) {

        pokerCards[] pokerCards = new pokerCards[52];
        pokerCards[] pokerCards1 = makeDeck();

        for (pokerCards card: pokerCards1) {
            System.out.println(card);
        }
        
    }
}
