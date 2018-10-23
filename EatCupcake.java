package motoVehicle;
import java.util.*;
public class EatCupcake {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Did anyone see you?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("YES")) {
            System.out.println("Was it a boss/lover/parent?");
            answer = sc.next();
            if (answer.equalsIgnoreCase("YES")) {
                System.out.println("Was it expensive?");
                answer = sc.next();
                if (answer.equalsIgnoreCase("YES")) {
                    System.out.println("Can you cut off the part that touched the floor?");
                    answer = sc.next();
                    if (answer.equalsIgnoreCase("YES")) {  // Last call if yes itya!!
                        System.out.println("EAT IT.");
                   //=========================================================//
                    } else if (answer.equalsIgnoreCase("NO")){  // if no make a last call ntwana
                        System.out.println("YOUR CALL.");

                       //=====================================================//
                    }//ends
                } else if (answer.equalsIgnoreCase("NO")) { // if it was not expensive
                    System.out.println("Was it a chocolate?");
                    answer = sc.next();
                    if (answer.equalsIgnoreCase("NO")) {
                        System.out.println("DON'T EAT IT.");
                    }else if (answer.equalsIgnoreCase("YES")) {
                        System.out.println("EAT IT.");
                    }
                } else if (answer.equalsIgnoreCase("YES")) {
                    System.out.println("EAT IT.");
                } else if (answer.equalsIgnoreCase("NO")) {
                    System.out.println("EAT IT.");
                } //end
            }else if (answer.equalsIgnoreCase("NO")) {
                System.out.println("DON'T EAT IT.");
            }

        } else if (answer.equalsIgnoreCase("NO")){
            System.out.println("Was it sticky?");
            answer = sc.next();
            if (answer.equalsIgnoreCase("YES")){
                System.out.println("Is is a raw steak?");
                answer = sc.next();
                if (answer.equalsIgnoreCase("YES")){
                    System.out.println("Are you a puma?");
                    answer = sc.next();
                    if (answer.equalsIgnoreCase("YES")) {
                        System.out.println("EAT IT.");
                    } else if (answer.equalsIgnoreCase("NO")){//if you not a puma
                        System.out.println("DON'T EAT IT.");

                    }

                }else if (answer.equalsIgnoreCase("NO")){ // if its not a steak yabo
                    System.out.println("Did the cat lick it?");
                      answer = sc.next();
                       if (answer.equalsIgnoreCase("YES")){
                        System.out.println("Is your cat healthy?");
                        answer = sc.next();
                           if (answer.equalsIgnoreCase("YES")) { // if the cat is okay you gonna be okay
                               System.out.println("EAT IT.");
                           }else if (answer.equalsIgnoreCase("NO")){
                               System.out.println("YOUR CALL.");
                           }// ends here

                    } else if (answer.equalsIgnoreCase("NO")){
                           System.out.println("EAT IT.");
                       }// ends here
                    }
              }else if (answer.equalsIgnoreCase("NO")){
                System.out.println("Is it an Emausaurus?");
                  answer = sc.next();
                  if (answer.equalsIgnoreCase("NO")){
                    System.out.println("Did the cat lick it?");
                    answer = sc.next();
                     if (answer.equalsIgnoreCase("NO")){
                        System.out.println("EAT IT.");
                       }else if (answer.equalsIgnoreCase("YES")){
                        System.out.println("Is your cat healthy?");
                        answer = sc.next();
                          if (answer.equalsIgnoreCase("YES")) { // if the cat is okay you gonna be okay
                            System.out.println("EAT IT.");
                            } else if (answer.equalsIgnoreCase("NO")) {
                             System.out.println("YOUR CALL.");
                        }
                    }

                }else if (answer.equalsIgnoreCase("YES")){
                    System.out.println("Are you a Megalosaurus?");
                      answer = sc.next();
                        if (answer.equalsIgnoreCase("YES")) {
                        System.out.println("EAT IT.");
                       }else if (answer.equalsIgnoreCase("NO")) {
                        System.out.println("DON'T EAT IT.");
                    }//ends
                }
            }//ends
        }//ends
    }// closing the Main method
} //closing the class


