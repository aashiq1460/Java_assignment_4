
public class Calculator {

    private int total = 0;

    // Reset calculator to zero
    public void reset() {
        total = 0;
    }

    // Add a positive number
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        total = total + number;
    }

    // Get the current total
    public int getValue() {
        return total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);
        calculator.add(5);

        System.out.println("Total: " + calculator.getValue());

        calculator.reset();
        System.out.println("After reset: " + calculator.getValue());
    }
}
