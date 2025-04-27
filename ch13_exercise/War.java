/**
 * Simulates a simple card game.
 */
public class War {

    public static void main(String[] args) {

        // create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // divide the deck into piles
        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));
        Pile p2 = new Pile();
        p2.addDeck(deck.subdeck(26, 51));

        // while both piles are not empty
        while (!p1.isEmpty() && !p2.isEmpty()) {
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();

            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
            } else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
            } else {
                // it's a tie...draw four more cards
                Pile warPile = new Pile(); // hold cards in the war
                warPile.addCard(c1);      // add the tied cards to the war pile
                warPile.addCard(c2);
                
                // handle the war (tie)
                while (diff == 0) {
                    System.out.println("War!");
                    
                    // if either player doesn't have enough cards
                    if (p1.size() < 4 || p2.size() < 4) {
                        // one player doesn't have enough cards to complete the war
                        System.out.println("Player " + (p1.size() < 4 ? "2" : "1") + " wins because the other player ran out of cards!");

                        return;
                    }
                    
                    // draw 3 cards from each player and add to the war pile
                    for (int i = 0; i < 3; i++) {
                        warPile.addCard(p1.popCard());
                        warPile.addCard(p2.popCard());
                    }

                    // draw one more card from each player to compare
                    c1 = p1.popCard();
                    c2 = p2.popCard();
                    warPile.addCard(c1);
                    warPile.addCard(c2);

                    // compare the new cards
                    diff = c1.getRank() - c2.getRank();
                    
                    // if the tie is still ocurring, we'll loop and do it again
                }
                
                // award cards to the winner of the war
                if (diff > 0) {
                    // player 1 wins the war
                    while (!warPile.isEmpty()) {
                        p1.addCard(warPile.popCard());
                    }
                } else {
                  
                    while (!warPile.isEmpty()) {
                        p2.addCard(warPile.popCard());
                    }
                }
            }
            
        }

        // display the winner
        if (p2.isEmpty()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

}
