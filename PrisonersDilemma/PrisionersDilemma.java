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
    //Writeing out instruction to display at game start
    public static void instructions(){
        System.out.println("Welcome to Prisioner Dilemma!");
        System.out.println("Allow me to summerise the game and how it plays out!");
        System.out.println("Prisioners dilemma is a game which you and someone else have been taken in for questioning by the police for an event. You and");
        System.out.println("you're partner in crime have been caught for braking the law! When the game begins you will be presented with two options. 1");
        System.out.println("Cooperate, this means to not give the police anything and try to help you're friends story as much as possible. 2");
        System.out.println("Defect, this means that you tell the police that you did nothing and it was all the other guy, this discredits the others story");
        System.out.println("lots, and can aid you very much. There will be 15 rounds, you will play aginst the computer, you're goal is to predict the computer's");
        System.out.println("Choices and minimise the amount of years you will serve! At the end of the 15 rounds the winner will be decided as the person who");
        System.out.println("will end up serving the least years! At the start of each round you will be prompted witha text box below, type 1 to Defect and");
        System.out.println("2 to cooperate! At the end of the round the results will be displayed of who siad what! Below I will give a tabel on how the years");
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
        boolean roundGo = true;
        instructions();
        String previousPlay ="";
        int roundNumber=0;
        //cheacking for user input and running the cooperate/defect function
        while (roundGo==true){
            Scanner keyboard = new Scanner(System.in);
            String userPlay = keyboard.nextLine();
            if (userPlay.length()==1){
                if (userPlay.charAt(0)=='1'){
                    System.out.println("cooperate");
                    selectStrat();
                    //runCooperate();
                    //storing old input to be displayed at round end
                    if (roundNumber==0){
                         previousPlay = "First round";
                         System.out.println(previousPlay);
                         previousPlay=userPlay;
                         roundNumber++;
                    } else{
                         System.out.println(previousPlay);
                         previousPlay=userPlay;
                         roundNumber++;
                    }
                } else if (userPlay.charAt(0)=='2'){
                    System.out.println("defect");
                    selectStrat();                    
                    //runDefect();
                    if (roundNumber==0){
                         previousPlay = "First round";
                         System.out.println(previousPlay);
                         previousPlay=userPlay;
                         roundNumber++;
                    } else{
                         System.out.println(previousPlay);
                         previousPlay=userPlay;
                         roundNumber++;
                    }
                } else {
                    System.out.println("please re write that, ");
                    
                }
            } else {
                System.out.print("please re-write you're responce, ");
            }
        }
    }
    //using a random interger to select the strat the CPU will use
    public static void selectStrat(){
        Random random = new Random();
        int strat = random.nextInt(2);
        strat++;
        if (strat==1){
            computerStrat1();
        } else {
            computerStrat2();
        }
    }
    //tit for tat, starting with defect
    public static void computerStrat1(){
        int roundCounter1=0;
        if (roundCounter1==0){
            
        }        
    }
    //tit for 2 tats, 2 defects starting
    public static void computerStrat2(){
         
    }
    public static void runCooperate(){
        
    }
    public static void runDefect(){
        
    } 
}