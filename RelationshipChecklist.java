                    /*=============================
                     * Author:--> NS Mabetshe (Maneza F8)
                     * Year:--> 2018
                     * Language:--> Java (Basic (if else statement))
                     * ============================*/

                    import java.util.Scanner;
                    import javax.swing.JOptionPane;

                    public class RelationshipChecklist {

                        public static void main(String[] args) {  // The main method
                            String toReply = "yes";
                            Scanner f8 = new Scanner(System.in);  // declaring f8anner from from Java util in the JDS


                            JOptionPane.showMessageDialog(null,"TEST YOUR RELATIONSHIP HERE FOLLOW THE STEPS!!");

                            // System.out.print("Please enter GUY's name:--> ");
                            do {   String name1 = JOptionPane.showInputDialog(null, "Please enter GUY's name: ");
                                //System.out.print("Please enter GIRL's name:--> ");
                                String name2 = JOptionPane.showInputDialog(null, "lease enter GIRL's name:") ;
                                // System.out.print("Please enter GUY's age :--> ");
                                String Stringage1 = JOptionPane.showInputDialog(null, "Please enter GUY's age :");
                                int age1;
                                age1 = Integer.parseInt(Stringage1);

                                String Stringage2 = JOptionPane.showInputDialog(null, "Please enter Girl's age :");
                                int age2;
                                age2 = Integer.parseInt(Stringage2);
     /*   System.out.print("Please enter GAL's age :--> ");
        int age2 = f8.nextInt();*/

                                String Stringage3 = JOptionPane.showInputDialog(null, "Please enter Years together :");
                                int years;
                                years = Integer.parseInt(Stringage3);
       /* System.out.print("Please enter years Together:--> ");
        int years = f8.nextInt();
*/
                                System.out.println();
                                JOptionPane.showMessageDialog(null, "The Guy is >> " + name1 + " Age >> " + age1 + " and The Gal is >> " + name2 + " Age >> " + age2 + " You are together for:-->  " + years + " years");
                                System.out.println();

                                // starting while loop so that the program can continue asking questions !!!


                                if(age1 <= 17 ) { // to restrict people younger than 18
                                    JOptionPane.showMessageDialog(null, name1 + "  SORRY YOU ARE TOO YOUNG TO PARTICIPATE! FOCUS AT SCHOOL FOR NOW!!");
                                }else if (age2 <= 17){
                                    JOptionPane.showMessageDialog(null,name2 + "  SORRY YOU ARE TOO YOUNG TO PARTICIPATE! FOCUS AT SCHOOL FOR NOW!!");

                                }else  if (age1 >= age2){    // test the age of a male to make sure its greater or equals to the gal
                                    JOptionPane.showMessageDialog(null,"Perfect Age difference!!");
                                    //   System.out.println("Do you have kids together?");
                                    String answer = JOptionPane.showInputDialog(null, "Do you have kids together?");
                                    if (answer.equalsIgnoreCase("YES")){
                                        // System.out.println("Great! " + name2 + " How many babies do you have with " + name1 + " ?");
                                        String baby3 = JOptionPane.showInputDialog(null, "Great! " + name2 + " How many babies do you have with " + name1 + " ?");
                                        int  baby;
                                        baby = Integer.parseInt(baby3);
                                        if (baby == 1){
                                            JOptionPane.showMessageDialog(null,"YOU GUYS ARE READY FOR THE NEXT STEP");
                                            JOptionPane.showMessageDialog(null,"Congratulations guys!!  " + years + " years Is a long Time hey");

                                        }else if (baby >= 2 ) {
                                            JOptionPane.showMessageDialog(null,"WOW guys " + baby + " kid's, You guys should consider getting Married!!");
                                            // System.out.println();
                                            JOptionPane.showMessageDialog(null,"Congratulations guys!!  " + years + " years Is a long Time hey!!");
                                        }
                                    } else if (answer.equalsIgnoreCase("NO")) {
                                        // System.out.println("Are you Married ?");
                                        answer = JOptionPane.showInputDialog(null, "Are You Married ?");
                                        if (answer.equalsIgnoreCase("NO")) {
                                            JOptionPane.showMessageDialog(null,"You should think about getting married soon and start planning about having kids! ");
                                            JOptionPane.showMessageDialog(null,"Congratulations guys!!  " + years + " years Is a long Time hey");
                                        } else if (answer.equalsIgnoreCase("YES")) {
                                            JOptionPane.showMessageDialog(null,"Don't feel bad! When the time is right you will be gifted with beautiful kids, Do not loose hope!!");
                                            JOptionPane.showMessageDialog( null,"Congratulations guys!!  " + years + " years Is a long Time hey");
                                        }
                                    }

                                }else if (age1 < age2) {
                                    JOptionPane.showMessageDialog(null,name2 + " You are a bit older than " + name1);
                                    //System.out.println("Are you happy with each other?");
                                    String answer = JOptionPane.showInputDialog(null, "Are you happy with each other?") ;

                                    if (answer.equalsIgnoreCase("YES")){
                                        JOptionPane.showMessageDialog(null,"That is what matters guys!!");
                                        // System.out.println("Do you have any kids?");
                                        answer = JOptionPane.showInputDialog(null, "Do you have any kids?") ;
                                        if (answer.equalsIgnoreCase("YES")){
                                            JOptionPane.showMessageDialog(null,"You should consider getting married soon and start planning about having kids! ");
                                            JOptionPane.showMessageDialog(null,"Congratulations guys!!  " + years + " years Is a long Time hey");
                                        }else if (answer.equalsIgnoreCase("NO")){
                                            JOptionPane.showMessageDialog(null,"Well keep it like that till you are married!!");
                                            JOptionPane.showMessageDialog(null,"Congratulations though!!  " + years + " years Is a long Time hey");
                                        }

                                    }else if (answer.equalsIgnoreCase("NO")) {
                                        JOptionPane.showMessageDialog(null,"You should consider ending the relationship!");
                                    }
                                }

                                // TODO add a print form that shows all the questions and answers

                                toReply =   JOptionPane.showInputDialog(null,"Do you want to check another couple  (Yes / No)");

                            } while (toReply.equalsIgnoreCase("Yes"));
                        }
                    }
