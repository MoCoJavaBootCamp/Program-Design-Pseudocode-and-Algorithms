/*
A program is needed to prompt the user operator for ten exam scores,
calculate the average score and display the
result to the screen.
The average score is calculated as the sum of the
scores divided by the number of scores.

import scanner
declare variables for score, input, total, average
prompt user 10 times
collect score
add to total
calculate average
print average
*/
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        int score;
        double total, average;
        Scanner input = new Scanner(System.in);
        total = 0.00;

        for (int i = 1; i <= 10; i ++) {
            System.out.printf("Enter a score (%s/10): ", i);
            score = input.nextInt();
            total += score;
        }

        average = (total/10);

        System.out.printf("The average score is %.2f", average);
    }
}
