public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x; 
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            // Handle the exception appropriately, e.g., set a default value, log the error, etc.
            y = -1; // Or any other suitable default
        }
        System.out.println(y);
    }
}