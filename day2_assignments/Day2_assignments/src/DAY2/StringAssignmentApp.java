package DAY2;


import java.util.Scanner;

	class StringUtility {

	    public int countVowels(String str) {
	        int count = 0;
	        str = str.toLowerCase();
	        for (char c : str.toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public int countConsonants(String str) {
	        int count = 0;
	        str = str.toLowerCase();
	        for (char c : str.toCharArray()) {
	            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
	                count++;
	            }
	        }
	        return count;
	    }

	    public boolean isPalindrome(String str) {
	        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

	    public String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public String toUpperCase(String str) {
	        return str.toUpperCase();
	    }

	    public String toLowerCase(String str) {
	        return str.toLowerCase();
	    }

	    public String replaceWord(String str, String oldWord, String newWord) {
	        return str.replace(oldWord, newWord);
	    }
	}


	public class StringAssignmentApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StringUtility util = new StringUtility();

	        String inputString;
	        System.out.println("Enter a string:");
	        inputString = scanner.nextLine();

	        int choice;

	        do {
	            System.out.println("\n--- String Operations Menu ---");
	            System.out.println("1. Count vowels");
	            System.out.println("2. Count consonants");
	            System.out.println("3. Check palindrome");
	            System.out.println("4. Reverse string");
	            System.out.println("5. Convert to UPPERCASE");
	            System.out.println("6. Convert to lowercase");
	            System.out.println("7. Replace a word");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice (1-8): ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Vowels count: " + util.countVowels(inputString));
	                    break;
	                case 2:
	                    System.out.println("Consonants count: " + util.countConsonants(inputString));
	                    break;
	                case 3:
	                    System.out.println("Is palindrome: " + util.isPalindrome(inputString));
	                    break;
	                case 4:
	                    System.out.println("Reversed string: " + util.reverseString(inputString));
	                    break;
	                case 5:
	                    System.out.println("Uppercase: " + util.toUpperCase(inputString));
	                    break;
	                case 6:
	                    System.out.println("Lowercase: " + util.toLowerCase(inputString));
	                    break;
	                case 7:
	                    System.out.print("Enter the word to be replaced: ");
	                    String oldWord = scanner.nextLine();
	                    System.out.print("Enter the new word: ");
	                    String newWord = scanner.nextLine();
	                    inputString = util.replaceWord(inputString, oldWord, newWord);
	                    System.out.println("Updated string: " + inputString);
	                    break;
	                case 8:
	                    System.out.println("Exiting... Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 8);

	        scanner.close();
	    }
	}


