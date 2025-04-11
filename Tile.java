public class Tile {
    // Instance variables
    private char letter;
    private int value;
    
    // Default constructor
    public Tile() {
        this.letter = ' ';
        this.value = 0;
    }
    
    // Constructor with parameters
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
      return this.letter;
    }
    
    public int getValue() {
      return this.value;
    }

    public void setLetter(char letter) {
      this.letter = letter;
    }

    public void setValue(int value) {
      this.value = value;
    }
    
    // print tile method
    public static void printTile(Tile tile) {
        System.out.print(tile.letter);
        System.out.print(tile.value);
    }
    
    // Method to display time in a readable format
    public String toString() {
        return String.format("%s,%d", this.letter, this.value);
    }

    public boolean equals(Tile tile) {
        if (this == tile) return true;

        if (tile == null || getClass() != tile.getClass()) return false;

        Tile other = (Tile) tile;
        return this.letter == other.letter && this.value == other.value;
    }
    
    // Main method with your original code plus test for increment()
    public static void main(String[] args) {

        Tile tile1 = new Tile('Z', 10);
        Tile tile2 = new Tile('D', 3);
        Tile tile3 = new Tile('Z', 10);
        Tile.printTile(tile1);
        Tile.printTile(tile2);
        Tile.printTile(tile3);
        System.out.println("\nare the tiles equal? - " + tile1.equals(tile2));
        System.out.println("\nare the tiles equal? - " + tile1.equals(tile3));

  }
}
