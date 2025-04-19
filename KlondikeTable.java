import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class KlondikeTable extends Canvas {
    
    private Image[][] images;
    private Image backImage;
    private int cardWidth, cardHeight;
    
    /**
     * Creates a KlondikeTable.
     * cardset is the name of the folder that contains the card images.
     */
    public KlondikeTable() {
        setBackground(new Color(0x088A4B));
        
        // create a 2-D array of card images
        images = new Image[14][4];
        
        String cardset = "cardset-oxymoron";
        String suits = "cdhs";
        
        // Load the card back image
        backImage = new ImageIcon(cardset + "/back192.gif").getImage();
        
        for (int suit = 0; suit <= 3; suit++) {
            char c = suits.charAt(suit);
            for (int rank = 1; rank <= 13; rank++) {
                String s = String.format("%s/%02d%c.gif", 
                        cardset, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
            }
        }
        
        // get the width and height of the cards and set the size of
        // the frame accordingly
        cardWidth = images[1][1].getWidth(null);
        cardHeight = images[1][1].getHeight(null);
        
        // set the size temporarily to get the insets
        setTableSize(14, 6);
    }
    
    /**
     * Sets the table size.
     * x and y are in units of card width/height.
     */
    public void setTableSize(double x, double y) {
        setSize((int) (x * cardWidth),
                (int) (y * cardHeight));
    }
    
    /**
     * Draws the Klondike solitaire layout.
     */
    public void paint(Graphics g) {
        // Draw the stock pile (draw pile) at top left
        g.drawImage(backImage, cardWidth/2, cardHeight/2, null);
        
        // Space for waste pile next to stock
        // Empty initially
        
        // Draw the tableau piles (7 columns)
        for (int pile = 0; pile < 7; pile++) {
            for (int card = 0; card <= pile; card++) {
                // Calculate the position for each card
                int x = cardWidth/2 + (pile * cardWidth * 3/2);
                int y = cardHeight * 2 + (card * cardHeight/4);
                
                // Determine if card should be face up or face down
                if (card == pile) {
                    // Top card is face up - choose a random card to display
                    int rank = (pile % 13) + 1;
                    int suit = pile % 4;
                    g.drawImage(images[rank][suit], x, y, null);
                } else {
                    // Other cards are face down
                    g.drawImage(backImage, x, y, null);
                }
            }
        }
        
        // Space for foundation piles (4 spots) at top right
        // Empty initially
    }
    
    public static void main(String[] args) {
        // create the frame and the canvas
        JFrame frame = new JFrame("Klondike Solitaire");
        Canvas canvas = new KlondikeTable();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add the canvas
        frame.getContentPane().add(canvas);
        
        // show the frame
        frame.pack();
        frame.setVisible(true);
    }
}
