import java.util.Scanner;
// Exercise 1: Hello World Program
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Exercise 2: Simple Calculator
import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}

// Exercise 3: Even or Odd Checker
class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }
}

// Exercise 4: Leap Year Checker
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}

// Exercise 5: Multiplication Table
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}

// Exercise 6: Data Type Demonstration
class DataTypeDemo {
    public static void main(String[] args) {
        int intVar = 42;
        float floatVar = 3.14f;
        double doubleVar = 2.71828;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("int: " + intVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
    }
}

// Exercise 7: Type Casting Example
class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = 25;
        
        // Double to int (explicit casting)
        int castedInt = (int) doubleValue;
        System.out.println("Double " + doubleValue + " casted to int: " + castedInt);
        
        // Int to double (implicit casting)
        double castedDouble = intValue;
        System.out.println("Int " + intValue + " casted to double: " + castedDouble);
    }
}

// Exercise 8: Operator Precedence
class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 4 + 3 * 2;
        
        System.out.println("10 + 5 * 2 = " + result1 + " (multiplication first)");
        System.out.println("(10 + 5) * 2 = " + result2 + " (parentheses first)");
        System.out.println("20 / 4 + 3 * 2 = " + result3 + " (division and multiplication before addition)");
    }
}

// Exercise 9: Grade Calculator
class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}

// Exercise 10: Number Guessing Game
import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Guess the number between 1 and 100!");
        
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}

// Exercise 11: Factorial Calculator
class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}

// Exercise 12: Method Overloading
class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("add(2.5, 3.7) = " + add(2.5, 3.7));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }
}

// Exercise 13: Recursive Fibonacci
class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        
        scanner.close();
    }
}

// Exercise 14: Array Sum and Average
class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        int sum = 0;
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        
        double average = (double) sum / size;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}

// Exercise 15: String Reversal
class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Method 1: Using StringBuilder
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        
        System.out.println("Reversed string: " + reversed.toString());
        
        // Method 2: Using loop
        String reversedLoop = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedLoop += input.charAt(i);
        }
        System.out.println("Reversed using loop: " + reversedLoop);
        
        scanner.close();
    }
}


    

