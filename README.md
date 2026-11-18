
# Calculator Project

## Description

This is a simple calculator program written in Java.
It can add positive integers and reset the total to zero.
If a negative number is added, the program throws an exception.

The Calculator class works as the model in the MVC pattern.

## Calculator Code

```java
public class Calculator {

    private int total = 0;

    // Reset the calculator to zero
    public void reset() {
        total = 0;
    }

    // Add a number to the total
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        total = total + number;
    }

    // Return the current total
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

The Calculator class stores the current total in a private variable called `total`. The starting value is zero.

The class has three main methods:

1. `add(int number)` adds a number to the total. If the number is negative, it throws an IllegalArgumentException.

2. `getValue()` returns the current value of the calculator.

3. `reset()` sets the total back to zero.

The `main()` method creates a Calculator object and tests these methods.

## Example Output

```text
Total: 35
After reset: 0
```

The program first adds 10, 20, and 5 to get 35.
After calling reset(), the total becomes zero.

## How I Used GitHub Copilot

I first created and tested the Calculator program in IntelliJ IDEA.

After that, I installed GitHub Copilot and used Copilot Chat to understand and explain my code.

I asked Copilot to explain how the `add(int number)` method works and suggest a simple alternative implementation.

I also asked Copilot to write a beginner-friendly explanation of the Calculator class and its three methods for my README.md file.

Copilot helped update the "How It Works" section. I reviewed the explanation and made it simple and easy to understand.

## Benefits of GitHub Copilot

- It helps explain Java code.
- It saves time when writing documentation.
- It can suggest different ways to write methods.
- It is useful for beginners learning programming.
- It makes code easier to understand.

## Drawbacks of GitHub Copilot

- Sometimes it can suggest incorrect code.
- Some explanations can be too complicated.
- It may suggest unnecessary changes.
- The programmer still needs to understand and test the code.

## My Experience

I found GitHub Copilot useful for understanding Java methods and writing explanations.

I prefer simple and readable code. Copilot can help me learn, but I still need to check its suggestions carefully.

For this assignment, Copilot was especially helpful when explaining the Calculator methods and improving the README file.

## GitHub Repository

https://github.com/aashiq1460/Java_assignment_4
