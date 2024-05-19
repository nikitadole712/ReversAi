import java.util.Scanner;

public class ReverseAiGame {

    // Method to reverse a string
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        // Converting the input string into a character array
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Reversing the array
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Converting the reversed character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Reverse AI Game!");
        System.out.println("Enter a sequence of moves (e.g., L, R, U, D): ");
        String moves = scanner.nextLine();

        String reversedMoves = reverse(moves);

        System.out.println("Original Moves: " + moves);
        System.out.println("Reversed Moves: " + reversedMoves);

        scanner.close();
    }
}
