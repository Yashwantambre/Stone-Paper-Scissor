import java.util.Random;
import java.util.Scanner;

public class RPS {
    // Function to implement the game
    static int game(char you, char computer) {
        // If both the user and computer
        // have chosen the same thing
        if (you == computer)
            return -1;

        // If user's choice is stone and
        // computer's choice is paper
        if (you == 's' && computer == 'p')
            return 0;

        // If user's choice is paper and
        // computer's choice is stone
        else if (you == 'p' && computer == 's')
            return 1;

        // If user's choice is stone and
        // computer's choice is scissor
        if (you == 's' && computer == 'z')
            return 1;

        // If user's choice is scissor and
        // computer's choice is stone
        else if (you == 'z' && computer == 's')
            return 0;

        // If user's choice is paper and
        // computer's choice is scissor
        if (you == 'p' && computer == 'z')
            return 0;

        // If user's choice is scissor and
        // computer's choice is paper
        else if (you == 'z' && computer == 'p')
            return 1;

        return -1; // Default case, indicating a draw
    }

    public static void main(String[] args) {
        // Stores the random number
        int n;

        char you, computer;
        int result;

        // Chooses the random number
        // every time
        Random rand = new Random();
        n = rand.nextInt(100);

        // Using simple probability 100 is
        // roughly divided among stone,
        // paper, and scissor
        if (n < 33)
            // s is denoting Stone
            computer = 's';
        else if (n > 33 && n < 66)
            // p is denoting Paper
            computer = 'p';
        else
            computer = 'z'; // z is denoting Scissor

        System.out.println("\n\n\n\n\t\t\t\tEnter s for STONE, p for PAPER and z for SCISSOR\n\t\t\t\t\t\t\t");

        // Input from the user
        Scanner scanner = new Scanner(System.in);
        you = scanner.next().charAt(0);

        // Function Call to play the game
        result = game(you, computer);

        if (result == -1) {
            System.out.println("\n\n\t\t\t\tGame Draw!\n");
        } else if (result == 1) {
            System.out.println("\n\n\t\t\t\tWow! You have won the game!\n");
        } else {
            System.out.println("\n\n\t\t\t\tOh! You have lost the game!\n");
        }
        System.out.printf("\t\t\t\tYou choose : %c and Computer choose : %c\n", you, computer);
    }
}
