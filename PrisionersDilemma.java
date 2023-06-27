import java.util.Scanner;
import java.util.Random;
/** 
 * Write a description of class PrisionersDilemma here.
 *  
 * @author Peter Day
 * @version 04/05/23
 */ 
public class PrisionersDilemma
{   
    //Writeing out instruction to display at game start hello
    public static void instructions(){
        System.out.println("Welcome to Prisioner Dilemma!");
        System.out.println("Allow me to summerise the game and how it plays out!");
        System.out.println("Prisioners dilemma is a game which you and someone else have been taken in for questioning by the police for an event. You and");
        System.out.println("you're partner in crime have been caught for braking the law! When the game begins you will be presented with two options. 1");
        System.out.println("Cooperate, this means to not give the police anything and try to help you're friends story as much as possible. 2");
        System.out.println("Defect, this means that you tell the police that you did nothing and it was all the other guy, this discredits the others story");
        System.out.println("lots, and can aid you very much. There will be 15 rounds, you will play aginst the computer, you're goal is to predict the computer's");
        System.out.println("Choices and minimise the amount of years you will serve! At the end of the 15 rounds the winner will be decided as the person who");
        System.out.println("will end up serving the least years! At the start of each round you will be prompted witha text box below, type 2 to Defect and");
        System.out.println("1 to cooperate! At the end of the round the results will be displayed of who siad what! Below I will give a tabel on how the years");
        System.out.println("are tallyed.");
        System.out.println("Cooperate + cooperate = 2 years each");
        System.out.println("Defect + defect = 5 years each");
        System.out.println("Coopearte + defect = 5 for first 0 for second");
        System.out.println("Defect + cooperate = 0 for first 5 for second");
    }
    //Initilising keyboard
    //Checking for user input
    public static void run(){
        //initilise varibles
        int playerYears = 0;
        int CPUyears = 0;
        boolean roundGo = true;
        instructions();
        String previousPlay ="";
        int roundNumber=0;
        //select strat
        Random random = new Random();
        int strat = random.nextInt(2);
        //cheacking for user input and running the cooperate/defect function
        while (roundGo==true){
            Scanner keyboard = new Scanner(System.in);
            String userPlay = keyboard.nextLine();
            //making sure that user input is not <1
            if (userPlay.length()==1){
                //makin sure user input is not >1
                if (userPlay.charAt(0)=='1'){
                    System.out.println("You have chosen to cooperate");
                    //storing old input to be displayed at round end
                    String CPUplay=previousPlay;
                    //if round = 0 the it will alwyas be defect-cooperate as the CPU always starts with defect
                    if (roundNumber==0){
                        previousPlay = "First round";
                        previousPlay=userPlay;
                        roundNumber++;
                        //PLAYERcooperateCPUdefect
                        playerYears=playerYears+5;
                        CPUyears=CPUyears+1;
                        System.out.println("CPU has chosen defect");
                        System.out.println(playerYears);  
                        System.out.println(CPUyears);  
                    } else{
                        if (strat==1){
                            if (CPUplay==userPlay){
                                //doubleCooperate
                                CPUyears=CPUyears+2;
                                playerYears=playerYears+2;
                                System.out.println("CPU has chosen cooperate");
                            } else{
                                //PLAYERcooperateCPUdefect
                                playerYears=playerYears+5;
                                CPUyears=CPUyears+0;
                                System.out.println("CPU has chosen defect");                                
                            }
                        } else{
                            System.out.println("work in progress");
                        }
                        //displaying talleyd years
                        previousPlay=userPlay;
                        System.out.println("CPU scentace, "+CPUyears);
                        System.out.println("Player scentace, "+playerYears);
                        roundNumber++;
                    }
                    //if userplay is defect
                } else if (userPlay.charAt(0)=='2'){
                    System.out.println("You have chosen to defect");
                    //if round = 0 the it will alwyas be double defect as the CPU always starts with defect
                    if (roundNumber==0){
                        previousPlay = "First round";
                        previousPlay=userPlay;
                        roundNumber++;
                        System.out.println("CPU has chosen defect");
                        playerYears=playerYears+3;
                        CPUyears=CPUyears+3;
                    } else{
                        //tit for tat
                        if (strat==1){
                            //Decideing what the CPU will play
                            String CPUplay=previousPlay;
                            //cheacking for double defect
                            if (CPUplay==userPlay){
                                System.out.println("CPU has chosen defect");
                                playerYears=playerYears+5;
                                CPUyears=CPUyears+5;
                                //doubledefect
                            } else{
                                playerYears=playerYears+0;
                                CPUyears=CPUyears+5;
                                System.out.println("CPU has chosen cooperate");
                            }
                        } else{
                            System.out.println("work in progress, strat 2");
                        }
                        //displaying talleyd years
                        previousPlay=userPlay;
                        System.out.println("CPU scentace, "+CPUyears);
                        System.out.println("Player scentace, "+playerYears);
                        //Continueing next round
                        roundNumber++;
                        System.out.println(playerYears);  
                        System.out.println(CPUyears);  
                    }
                } else {
                    //Displaying if an unacceptable input is detected
                    System.out.println("Please re-write you're responce, ");
                }
            } else {
                //Displaying if an unacceptable input is detected
                System.out.print("Please re-write you're responce, ");
            }
        }
    }
}                                                                                                                                                                    