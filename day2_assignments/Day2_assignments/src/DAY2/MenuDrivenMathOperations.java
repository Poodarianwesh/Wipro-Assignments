package DAY2;


import java.util.Scanner;

public class MenuDrivenMathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueMenu;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the number: ");
                    int tableNum = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    int factNum = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + factNum + " is " + factorial);
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;

                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        int i = 2;
                        while (i <= primeNum / 2) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                    }

                    if (isPrime)
                        System.out.println(primeNum + " is a Prime Number.");
                    else
                        System.out.println(primeNum + " is NOT a Prime Number.");
                    break;

                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = scanner.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= terms; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }

            System.out.print("\nBack to Menu? (Y/N): ");
            continueMenu = scanner.next().charAt(0);

        } while (continueMenu == 'Y' || continueMenu == 'y');
        
        System.out.println("Thank you for using the program!");
        scanner.close();
    }
}


