package fundamental;

import java.util.Random;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and
advance the user that number of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
repeat this 4 additional times for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If the user is greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */
public class Another {
    public static void main(String args[]) {
        Random random = new Random();
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRoll = 5;
        for (int i = 1; i <= maxRoll; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.println(String.format("Roll #%d: You've rolled a %d.", i, die));
            if (currentSpace == lastSpace) {
                System.out.println("You are now on space" + currentSpace + ". You win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("Unfortunately, that takes you past" + lastSpace + "spaces. You lose!");
                break;
            } else if (i == maxRoll && currentSpace < lastSpace) {
                System.out.println("You are now on space" + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all 20 spaces. You lose!");
            } else {
                int spaceToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + "and have " + spaceToGo + " more to go.");
            }
        }

    }
}
