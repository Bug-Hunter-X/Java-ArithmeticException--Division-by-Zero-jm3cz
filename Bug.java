public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 5 / x; // This line will throw an ArithmeticException
        System.out.println(y);
    }
}