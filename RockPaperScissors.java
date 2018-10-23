package motoVehicle;

import java.util.*;

public class RockPaperScissors {
    final static int ROCK = 1, PAPER = 2 , SCISSOR = 3;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int score = 0, score2 = 0;

        System.out.println("Player One: Choose your weapon!");
        int player1 = scan.nextInt();
        System.out.println("Good choice!");

        System.out.println( "Player Two: Choose your weapon!");
        int player2 = scan.nextInt();
        System.out.println("Good choice!");

       do {


               switch (player1) {
                   case ROCK:
                       if (player2 == ROCK) {
                           System.out.println("Player One chose: rock");
                           System.out.println("Player Two chose: rock");
                           System.out.println("It’s a draw!");
                           System.out.println("The score is now: " + score + " - " + score2);
                       }
                      else if (player2 == SCISSOR) {
                           System.out.println("Player One chose: rock");
                           System.out.println("Player One chose: scissor");

                           System.out.println();
                           System.out.println("Player One Wins");
                           score++;
                           System.out.println("The score is now: " + score + " - " + score2 );
                       } else {
                           System.out.println("Player One chose: rock");
                           System.out.println("Player Two chose: paper");
                           System.out.println();
                           System.out.println("Player Two Wins");
                           score2++;
                           System.out.println("The score is now: " + score + " - " + score2 );
                       }
                       break;

                   case PAPER:
                       if (player2 == PAPER) {
                           System.out.println("Player One chose: paper");
                           System.out.println("Player Two chose: paper");
                           System.out.println("It’s a draw!");
                           System.out.println("The score is now: " + score + " - " + score2);
                       }


                      else if (player2 == ROCK) {
                           System.out.println("Player One chose: paper");
                           System.out.println("Player Two chose: rock");
                           System.out.println();
                           System.out.println("Player One Wins");
                           score++;
                           System.out.println("The score is now: " + score + " - " + score2 );
                       } else if (player2== SCISSOR) {

                           System.out.println("Player One chose: paper");
                           System.out.println("Player Two chose: scissor");
                           System.out.println();
                           System.out.println("Player Two Wins");
                           score2++;
                           System.out.println("The score is now: " + score + " - " + score2);
                       }
                       break;
                   case SCISSOR:
                       if (player2 == SCISSOR) {
                           System.out.println("Player One chose: scissor");
                           System.out.println("Player Two chose: scissor");
                           System.out.println("It’s a draw!");
                           System.out.println("The score is now: " + score + " - " + score2);
                       }

                       else if (player2 == PAPER) {
                           System.out.print("Player One chose: scissors");
                           System.out.print("Player One chose: paper");
                           System.out.println();
                           System.out.println("Player One Wins");
                           score++;
                           System.out.println("The score is now: " + score + " - " + score2 );
                       } else {
                           System.out.println("Player one chose: scissor");
                           System.out.println("Player two chose: rock");

                           System.out.println();
                           System.out.println("Player Two Wins");
                           score2++;
                           System.out.println("The score is now: " + score + " - " + score2);
                       }
                       break;
                   case 4:
                       if(player2 == player2){
                           System.out.println("player One and Player Two are tied with " + score + "points.");
                       }else if (player1 > player2) {
                           System.out.println("The winner is Player One with " + score + "points.");
                       }else {
                           System.out.println("The winner is Player Two with " + score2 + "points.");
                           System.out.println("Quitting.");
                       }
               }



           System.out.println("Player One: Choose your weapon!");
           player1 = scan.nextInt();


           if (player1!=4){
               System.out.println("Good choice!");
               System.out.println( "Player Two: Choose your weapon!");
               player2 = scan.nextInt();
               System.out.println("Good choice!");

           }else
               if(score == score2){
               System.out.println("player One and Player Two are tied with " + score + " points.");
                   System.out.println("Quitting.");
           }else if (score > score2) {
               System.out.println("The winner is Player One with " + score + " points.");
               System.out.println("Quitting");
           }else if (score < score2) {
               System.out.println("The winner is Player Two with " + score2 + " points.");
               System.out.println("Quitting.");
           }
         } while ((player1 == 1) || (player1 == 2) || (player1 == 3) ) ;

       }

}

