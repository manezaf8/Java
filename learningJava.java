package motoVehicle;

public class learningJava {
   public static void main(String[] args){

       String gander = "boy";

       switch (gander) {
           case "male" :
               System.out.println("Male");
               break;
           case "female":
               System.out.println("Female");
               break;
           case "boy":
               System.out.println("boy");
               break;
           default:
               System.out.println("girl");
       }

       for (int i = 1; i< 11; i++) {
           System.out.print(i + ", ");
       }

       System.out.println();

       String [] friends = {"Sne", "Luba", "LILI", "Vista"};

       for (int i = 0; i < friends.length; i++) {
           System.out.print( " names=  " + friends[i]);
       }

       System.out.println();

       for (String friend : friends){
           System.out.println(friend );
       }

       for (int i = 0; i < 5; i++ ) {
           System.out.println("Maneza you have from "+ i);
       }

       System.out.println();
       System.out.println();

       System.out.println("Enter a number");
       int x = 7;

       while ( x < 7) {

           for (int i = 0; i < 7; i += 7) {

               System.out.println("Lucky =  " + x);
           }

       }
    }
}
