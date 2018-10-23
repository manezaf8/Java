package motoVehicle;

public class Game {

    public static void main(String[] args) {
        int score = 80;

        // check to see if player score is greater than 100
        if( score > 100 ) {
            System.out.print("You finished the game, congratulations!");
        }

        // check to see if player score is greater than 70, but only if it is less than 100
        else if(score > 70){
            System.out.print("You were so close");
        }
        // check to see if player score is greater than 40, only if it is less than 100, and less than 70
        else if(score > 40){
            System.out.print("Keep practising you got this!");
        }
        else {
            System.out.print("Have another go");
        }
    }
}
