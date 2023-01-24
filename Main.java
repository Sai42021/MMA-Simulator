import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args){
        try{
        System.out.println("");
        System.out.println("MMA Tournament simulation");
        System.out.println("****************************");

        try (//Scanner
        Scanner In = new Scanner(System.in)) {
            //Objects
            Fighter f = new Fighter();//fighter object
            Bout b = new Bout();//bout object
            ScoresANDrecords sAr = new ScoresANDrecords();//scores and records object
            Schedule s = new Schedule();//schedule object 

            //Object options
            System.out.println("Enter 1 for Fighter options");
            System.out.println("Enter 2 for Bout options");
            System.out.println("Enter 3 for Scores and Records");
            System.out.println("Enter 4 for Schedule options");

            String Opt1_4 = In.next();//User input for objects

            //Fighter options
            if(Opt1_4.equals("1")){
                System.out.println("");
                System.out.println("Enter i to input fighter records");
                System.out.println("Enter v to view all fighter records");
                System.out.println("Enter b to go back home");
                System.out.println("Enter q to exit");
                System.out.println("");
                String F_opt = In.next().toLowerCase();

                    if(F_opt.equals("i")){
                        //Set fighter information
                        System.out.println("Enter fighter name: ");
                        f.setName(In.next());

                        System.out.println("Enter fighter nickname: ");
                        f.setNickname(In.next());

                        System.out.println("Enter fighter surname: ");
                        f.setSurname(In.next());

                        System.out.println("Enter fighter weight(lb): ");
                        f.setWeight(In.nextDouble());

                        System.out.println("Enter fighter height(m): ");
                        f.setHeight(In.nextDouble());

                        System.out.println("Enter fighter age: ");
                        f.setAge(In.nextInt());

                        System.out.println("Enter fighter reach: ");
                        f.setReach(In.nextDouble());

                        System.out.println("Enter fighter record: ");
                        f.setFightRecord(In.next());

                        //To write data to a txt file
                        File file = new File("Fighters file.text");
            	        FileWriter fw = new FileWriter(file, true); 
            	        PrintWriter pw = new PrintWriter(fw); 

                        //To foramt data in txt file
                        pw.println("Name: " + f.getName() + "\n" + "Nickname: " + f.getNickname() + "\n" + "Surname: " + f.getSurname() + "\n" + "Weight(lb): " + f.getWeight() + "\n" + "Height: " + f.getHeight() + "\n" + "Age: " + f.getAge() + "\n" + "Reach: " + f.getReach() + "\n" + "Fight Record: " + f.getFightRecord() + "\n" + "\n");	
            	        pw.close();
            
                        System.out.println("All done!");
                        System.out.println(" ");

                        System.out.println("Enter b to go back home and q to exit: ");
                        String QforDisplayAllInF = In.next().toLowerCase();

                        if(QforDisplayAllInF.equals("b")){
                            Main.main(args);
                            System.out.println(" ");
                        } else{
                            System.out.println("Thank you for using the MMA simulator!");
                        }
                    }
                    else if(F_opt.equals("v")){
                        //The following try-catch will be used to read the fighter text file to the console
                        try{
                            File fileObj = new File("Fighters file.text");
                            Scanner myReader = new Scanner(fileObj);
                            while (myReader.hasNextLine()){
                                String data = myReader.nextLine();
                                System.out.println(data);
                            }
                            myReader.close();
                        } catch (FileNotFoundException e){
                            System.out.println("An error has occured.");
                            e.printStackTrace();
                        }

                        System.out.println("Enter b to go back home and q to exit: ");
                        String QforDisplayAllInF = In.next().toLowerCase();

                        if(QforDisplayAllInF.equals("b")){
                            Main.main(args);
                            System.out.println(" ");
                        }
                        else{
                            System.out.println("Thanks for using the MMA simulator");
                            System.out.println(" ");
                        }

                    }

                    else if(F_opt.equals("b")){
                        Main.main(args);
                        System.out.println("");
                    }

                    else if(F_opt.equals("q")){
                        System.out.println("Thank you for using the MMA simulator!");
                    }//END OF FIGHTER OPTIONS!!!!

            //Bout options    
            }if(Opt1_4.equals("2")){
                System.out.println("");
                System.out.println("Enter i to input bout records");
                System.out.println("Enter v to view all bout records");
                System.out.println("Enter b to go back home");
                System.out.println("Enter q to exit");
                System.out.println("");
                String B_opt = In.next().toLowerCase();

                if(B_opt.equals("i")){
                    System.out.println("Enter fighter1: ");
                    b.setFighter1(In.next());

                    System.out.println("Enter fighter2: ");
                    b.setFighter2(In.next());

                    System.out.println("Enter Weigt Class: ");
                    b.setWeigtClass(In.next());

                    System.out.println("Enter Announcer: ");
                    b.setAnnouncer(In.next());

                    System.out.println("Enter start time: ");
                    b.setStartTime(In.next());

                    System.out.println("Enter number of rounds: ");
                    b.setNoOfRounds(In.nextInt());

                    System.out.println("Enter title: ");
                    b.setTitle(In.next());

                    //To write data to a txt file
                    File file = new File("Bouts File.text");
                    FileWriter fw = new FileWriter(file, true); 
                    PrintWriter pw = new PrintWriter(fw); 

                    //To foramt data in txt file
                    pw.println("Fighter1: " + b.getFighter1() + "\n" + "Fighter2: " + b.getFighter2() + "\n" + "Weight class: " + b.getWeigtClass() + "\n" + "Announcer: " + b.getAnnouncer() + "\n" + "Start time: " + b.getStartTime() + "\n" + "Number of rounds: " + b.getNoOfRounds() + "\n" + "Title: " + b.getTitle() + "\n" + "\n");	
                    pw.close();
        
                    System.out.println("All done!");
                    System.out.println(" ");

                    System.out.println("Enter b to go back home and q to exit: ");
                    String QforDisplayAllInF = In.next().toLowerCase();

                    if(QforDisplayAllInF.equals("b")){
                        Main.main(args);
                        System.out.println(" ");
                    } else{
                        System.out.println("Thank you for using the MMA simulator!");
                    }
                }else if(B_opt.equals("v")){
                    //The following try-catch will be used to read the bouts text file to the console
                    try{
                        File fileObj = new File("Bouts File.text");
                        Scanner myReader = new Scanner(fileObj);
                        while (myReader.hasNextLine()){
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e){
                        System.out.println("An error has occured.");
                        e.printStackTrace();
                    }

                    System.out.println("Enter b to go back home and q to exit: ");
                    String QforDisplayAllInF = In.next().toLowerCase();

                    if(QforDisplayAllInF.equals("b")){
                        Main.main(args);
                        System.out.println(" ");
                    }
                    else{
                        System.out.println("Thanks for using the MMA simulator");
                        System.out.println(" ");
                    }

                }
                else if(B_opt.equals("b")){
                    Main.main(args);
                    System.out.println("");
                }

                else if(B_opt.equals("q")){
                    System.out.println("Thank you for using the MMA simulator!");
                }
            
            }//END OF BOUT OPTIONS!!!!

            //Scores and records
            if(Opt1_4.equals("3")){
                System.out.println("");
                System.out.println("Enter i to input scores records");
                System.out.println("Enter v to view all scores and records");
                System.out.println("Enter b to go back home");
                System.out.println("Enter q to exit");
                System.out.println("");
                String sAr_opt = In.next().toLowerCase();

                if(sAr_opt.equals("i")){
                    System.out.println("Enter Fighter name: ");
                    sAr.setFighterName(In.next());

                    System.out.println("Enter Scores: ");
                    sAr.setScores(In.next());

                    System.out.println("Enter Wins and loses: ");
                    sAr.setFighterWinLoseRecord(In.next());

                    System.out.println("Enter Special records: ");
                    sAr.setFighterSpecialRecords(In.next());

                     //To write data to a txt file
                     File file = new File("Scores and Records File.text");
                     FileWriter fw = new FileWriter(file, true); 
                     PrintWriter pw = new PrintWriter(fw); 
 
                     //To foramt data in txt file
                     pw.println("Fighter name: " + sAr.getFighterName() + "\n" + "Scores: " + sAr.getScores() + "\n" + "Wins and loses: " + sAr.getFighterWinLoseRecord() + "\n" + "Special records: " + sAr.getFighterSpecialRecords() + "\n" + "\n");	
                     pw.close();
         
                     System.out.println("All done!");
                     System.out.println(" ");
 
                     System.out.println("Enter b to go back home and q to exit: ");
                     String QforDisplayAllInF = In.next().toLowerCase();
 
                     if(QforDisplayAllInF.equals("b")){
                         Main.main(args);
                         System.out.println(" ");
                     } else{
                         System.out.println("Thank you for using the MMA simulator!");
                     }
                }
                else if(sAr_opt.equals("v")){
                    //The following try-catch will be used to read the bouts text file to the console
                    try{
                        File fileObj = new File("Scores and Records File.text");
                        Scanner myReader = new Scanner(fileObj);
                        while (myReader.hasNextLine()){
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e){
                        System.out.println("An error has occured.");
                        e.printStackTrace();
                    }

                    System.out.println("Enter b to go back home and q to exit: ");
                    String QforDisplayAllInF = In.next().toLowerCase();

                    if(QforDisplayAllInF.equals("b")){
                        Main.main(args);
                        System.out.println(" ");
                    }
                    else{
                        System.out.println("Thanks for using the MMA simulator");
                        System.out.println(" ");
                    }
                }
                else if(sAr_opt.equals("b")){
                    Main.main(args);
                    System.out.println("");
                }

                else if(sAr_opt.equals("q")){
                    System.out.println("Thank you for using the MMA simulator!");
                }//END OF SCORES AND RECORDS OPTIONS!!!!
            }
            //Schedule options
            if(Opt1_4.equals("4")){
                System.out.println("");
                System.out.println("Enter i to input schedule details");
                System.out.println("Enter v to view schedule");
                System.out.println("Enter b to go back home");
                System.out.println("Enter q to exit");
                System.out.println("");
                String s_opt = In.next().toLowerCase();
            
                    if(s_opt.equals("i")){
                        System.out.println("Enter first bout start time: ");
                        s.setFirstBoutStart(In.next());
            
                        System.out.println("Enter second bout start time: ");
                        s.setSecondBoutStart(In.next());
            
                        System.out.println("Enter third bout start time: ");
                        s.setThirdBoutStart(In.next());
            
                        System.out.println("Enter fourth bout start time: ");
                        s.setFourthBoutStart(In.next());
            
                        System.out.println("Enter main event start time: ");
                        s.setMainBoutStart(In.next());
            
                        //To write data to a txt file
                        File file = new File("Schedule File.text");
                        FileWriter fw = new FileWriter(file, true); 
                        PrintWriter pw = new PrintWriter(fw); 
             
                        //To foramt data in txt file
                        pw.println("First bout: " + s.getFirstBoutStart() + "\n" + "Second bout: " + s.getSecondBoutStart() + "\n" + "Third bout: " + s.getThirdBoutStart() + "\n" + "Fourth bout: " + s.getFourthBoutStart() + "\n" + "Main event: " + s.getMainBoutStart() + "!" + "\n" + "\n");	
                        pw.close();
                     
                        System.out.println("All done!");
                        System.out.println(" ");
             
                        System.out.println("Enter b to go back home and q to exit: ");
                        String QforDisplayAllInF = In.next().toLowerCase();
             
                        if(QforDisplayAllInF.equals("b")){
                            Main.main(args);
                            System.out.println(" ");
                        } else{
                            System.out.println("Thank you for using the MMA simulator!");
                                }
            
                        } else if(s_opt.equals("v")){
                            //The following try-catch will be used to read the bouts text file to the console
                        try{
                        File fileObj = new File("Schedule File.text");
                        Scanner myReader = new Scanner(fileObj);
                        while (myReader.hasNextLine()){
                        String data = myReader.nextLine();
                        System.out.println(data);
                        }
                        myReader.close();
                        } catch (FileNotFoundException e){
                        System.out.println("An error has occured.");
                        e.printStackTrace();
                        }
            
                        System.out.println("Enter b to go back home and q to exit: ");
                        String QforDisplayAllInF = In.next().toLowerCase();
            
                        if(QforDisplayAllInF.equals("b")){
                        Main.main(args);
                        System.out.println(" ");
                        }
                        else{
                        System.out.println("Thanks for using the MMA simulator");
                        System.out.println(" ");
                        }
                        }//END OF SCHEDULE OPTIONS!!!!
                        else if(s_opt.equals("b")){
                        Main.main(args);
                        System.out.println("");
                        }
                
                        else if(s_opt.equals("q")){
                        System.out.println("Thank you for using the MMA simulator!");
                }//END OF SCHEDULE OPTIONS!!!!
            }
        }
    
        //Exception handling to deal with any unexpected errors
    } catch (Exception e){
        System.out.println("");
        System.out.println("Oops. Looks like something went wrong.");
    } finally{
        System.out.println("Double check text files to insure data has been correctly input.");
    }
    //END OF PROGRAM!!!!
  }
}