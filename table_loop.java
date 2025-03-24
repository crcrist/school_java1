public class table_loop {

  public static void main(String[] args) {
      loop(10);
    }

  public static void loop(int n) {
    int i = n;
    while (i > 1) {
      System.out.println(i);
      if (i % 2 == 0) {
        i = i / 2;
        System.out.print(i);
      } else {
          i = i + 1;
          System.out.print(i);
      }
    }
  }
}
