package DAY2;


import java.util.Scanner;

class MathOperations {

    public void printTable(int number) {
        System.out.println("Multiplication Table of " + number + ":");
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
        for (int i = 2; i <= number; i++) {
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

        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }


    public void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        System.out.println("Fibonacci series with " + terms + " terms:");
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}


public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations math = new MathOperations();

        int choice;
        do {
            System.out.println("\n--- Math Operations Menu ---");
            System.out.println("1. Print Multiplication Table");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1–5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number for the table: ");
                    int tableNum = scanner.nextInt();
                    math.printTable(tableNum);
                    break;
                case 2:
                    System.out.print("Enter a number to find factorial: ");
                    int factNum = scanner.nextInt();
                    math.calculateFactorial(factNum);
                    break;
                case 3:
                    System.out.print("Enter a number to check prime: ");
                    int primeNum = scanner.nextInt();
                    math.checkPrime(primeNum);
                    break;
                case 4:
                    System.out.print("Enter number of Fibonacci terms: ");
                    int terms = scanner.nextInt();
                    math.printFibonacci(terms);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
