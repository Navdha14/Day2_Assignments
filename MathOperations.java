
import java.util.Scanner;

class MathOperations {

    public void printTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public void calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    public void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}

