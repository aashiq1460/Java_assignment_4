
# Calculator Project

## Description
This is a simple calculator program written in Java.
It can add positive numbers and reset the total to zero.
If a negative number is added, an exception is thrown.

## Calculator Code

```java
public class Calculator {

    private int total = 0;

    public void reset() {
        total = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        total = total + number;
    }

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
```

## How It Works

The Calculator class keeps track of a total.

- reset() sets the total to zero.
- add() adds a number to the total.
- getValue() returns the current total.
- main() runs the program and tests the methods.

Negative numbers are not allowed.

## GitHub Copilot

GitHub Copilot can help programmers write Java code.
It can suggest methods, comments, and explanations.

### Benefits
- Saves time writing code.
- Helps with Java syntax.
- Suggests useful comments.

### Drawbacks
- Sometimes generates incorrect code.
- Suggestions may be difficult to understand.
- Code must be reviewed and tested.
