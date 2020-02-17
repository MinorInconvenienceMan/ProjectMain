import java.util.Scanner;
import java.util.Random;

public class RPS
{
    public RPS()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Type in your number: 1-Rock, 2-Paper, 3-Scissors");

        int end = 1;

        while (end == 1){
            int input = scan.nextInt();
            int random = (int)(Math.random() * 3 + 1);
            int tally = 0;
            System.out.println("Computers number " + random);
            if (input == 1 && random == 1){System.out.println("Neutral, computer got rock");}
            if (input == 1 && random == 2){System.out.println("Lose computer got paper"); tally++;}
            if (input == 1 && random == 3){System.out.println("Win computer got scissors");}
            if (input == 2 && random == 1){System.out.println("Win computer got rock");}
            if (input == 2 && random == 2){System.out.println("Neutral computer got paper");}
            if (input == 2 && random == 3){System.out.println("Lose computer got scissors"); tally++;}
            if (input == 3 && random == 1){System.out.println("Lose computer got rock"); tally++;}
            if (input == 3 && random == 2){System.out.println("Win computer got paper");}
            if (input == 3 && random == 3){System.out.println("Neutral computer got scissors");
                if (input == 4){end++;}
                if (tally == 5) {System.out.println("Losing streak, you win on me."); tally = 0;}
            }

        }
    }
}

