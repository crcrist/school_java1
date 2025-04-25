public class Card {
  
  // Instance variables
    private final int rank; // 2, 3, 4, 5, 6, 7, 8, 9, 10, j, q, k, ace
    private final int suit; // spades, jacks, clubs, diamonds

  public static final String[] RANKS = {
     null, "Ace", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"};
    
    // Constructor with parameters
    public Card(int rank, int suit) {
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
    public static void printTile(Card Card) {
        System.out.print(Card.rank);
        System.out.print(Card.suit);
    }
    
    // Method to display time in a readable format
    public String toString() {
      return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    public int compareTo(Card that) {
       
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

    public static Card[] makeDeck() {
      Card[] deck = new Card[52];
      int index = 0;
      for (int suit = 0; suit <= 3; suit++) {
          for (int rank = 1; rank <= 13; rank++) {
              deck[index] = new Card(rank, suit);
              index++;
            }
        }
      return deck;
    }

      public static int[] suitHist(Card[] hand) {
          // Create an array to hold the count of each suit
          int[] hist = new int[4]; // 4 suits: Clubs, Diamonds, Hearts, Spades
          
          // Loop through the hand once
          for (int i = 0; i < hand.length; i++) {
              int suit = hand[i].getSuit();

              hist[suit]++;  
              // What should you do for each card?
              // Hint: You need to get the suit and increment the corresponding counter
              
              // Your code here...
          }
          
          return hist;
      }

      public static boolean hasFlush(Card[] hand) {
          int[] suitHistogram = suitHist(hand);      

          for (int count : suitHistogram) {
                if (count >= 5) {
                  return true;    
                }
            }

          return false;
      }


      public static boolean hasRoyal(Card[] hand) {
          // get histogram to determine which suit has the flush
          int[] suitHist = suitHist(hand);
          int flushSuit = -1;
          
          // determine which suit has a flush
          for (int i = 0; i < suitHist.length; i++) {
              if (suitHist[i] >= 5) {
                  flushSuit = i;
                  break;

              }
          }


          // check for the specific royal cards (10, j, q, k, a) in the flush suit
          boolean has10 = false;
          boolean hasJ = false;
          boolean hasQ = false;
          boolean hasK = false;
          boolean hasA = false;
        
          // check each card in the hand
          for (int i = 0; i < hand.length; i++) {
              // only consider cards of the flush suit
              if (hand[i].getSuit() == flushSuit) {
                  int rank = hand[i].getRank();

                  // check for each required card
                  if (rank == 10) has10 = true;
                  if (rank == 11) hasJ = true;
                  if (rank == 12) hasQ = true;
                  if (rank == 13) hasK = true;
                  if (rank == 1) hasA = true;
              }
          }
          
          // return true only if all five royal cards are present in the flush suit
          return has10 && hasJ && hasQ && hasK && hasA;

    }


    // Main method with your original code plus test for increment()
    public static void main(String[] args) {

        Card[] Card = new Card[52];
        Card[] Card1 = makeDeck();

        for (Card card: Card1) {
            System.out.println(card);
        }
    
        // Test the suitHist method
        // First, create a hand of cards (for example, 5 random cards)
        Card[] hand = new Card[5];
        hand[0] = new Card(1, 0);  // Ace of Clubs
        hand[1] = new Card(10, 0); // 10 of Clubs
        hand[2] = new Card(12, 2); // Queen of Hearts
        hand[3] = new Card(5, 3);  // 5 of Spades
        hand[4] = new Card(7, 0);  // 7 of Clubs
        
        Card[] hand2 = new Card[5];
        hand2[0] = new Card(10, 0);  // Ace of Clubs
        hand2[1] = new Card(11, 0); // 10 of Clubs
        hand2[2] = new Card(12, 0); // Queen of Hearts
        hand2[3] = new Card(13, 0);  // 5 of Spades
        hand2[4] = new Card(1, 0);  // 7 of Clubs


        
        // Call the suitHist method
        int[] suitHistogram = suitHist(hand);
        
        // Display the results
        System.out.println("\nSuit histogram for hand:");
        for (int i = 0; i < suitHistogram.length; i++) {
            System.out.println(SUITS[i] + ": " + suitHistogram[i]);
        }
        
        boolean flush = hasFlush(hand);
        System.out.println("is there a flush?\n" + flush);

        boolean royalFlush = hasRoyal(hand2);
        System.out.println("is there a royal flush?\n" + royalFlush); 
        
    }
}
