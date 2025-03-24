public class Test {
    public static void main(String[] args) {
        // String + char
        String str = "Hello";
        char ch = 'A';
        System.out.println("String + char: " + str + ch);
        System.out.println("Type of result: String");
        
        // char + char
        char ch1 = 'A';  // ASCII value 65
        char ch2 = 'B';  // ASCII value 66
        System.out.println("char + char: " + (ch1 + ch2));
        System.out.println("Type of result: int (performs numeric addition of ASCII values)");
        
        // int + char
        int num = 10;
        char letter = 'C';  // ASCII value 67
        System.out.println("int + char: " + (num + letter));
        System.out.println("Type of result: int");
        
        // double + int
        double dbl = 5.5;
        int integer = 3;
        System.out.println("double + int: " + (dbl + integer));
        System.out.println("Type of result: double");
        
        // boolean + String
        boolean bool = true;
        String text = " is the answer";
        System.out.println("boolean + String: " + bool + text);
        System.out.println("Type of result: String");
        
        // String + any primitive
        String beginning = "Number: ";
        int value = 42;
        System.out.println("String + any primitive: " + beginning + value);
        System.out.println("Type of result: String");
        
        // char + int + String
        char grade = 'A';
        int score = 95;
        String message = " is excellent";
        System.out.println("Complex expression: " + grade + score + message);
        System.out.println("Type of result: String");
        
        // Adding parentheses changes evaluation order
        System.out.println("With parentheses: " + grade + (score + message));
        System.out.println("Type of result: String");
    }
}
