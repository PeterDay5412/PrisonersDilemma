import java.io.*;
import java.lang.*;
import java.util.*;
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
        System.out.println("are tallyed!");
        System.out.println("Good luck!");
        System.out.println("Cooperate + cooperate = 2 years each");
        System.out.println("Defect + defect = 5 years each");
        System.out.println("Coopearte + defect = 5 for first 0 for second");
        System.out.println("Defect + cooperate = 0 for first 5 for second");
    }
    //Initilising keyboard
    //Checking for user input
    public static void run(){
        //initilise varibles
        int gameLength = 15;
        int playerYears = 0;
        int CPUyears = 0;
        //whether or not the loop wil run
        boolean roundGo = true;
        //displaying game instuctions
        instructions();
        //init previous play, fo tit for tat strat
        String previousPlay ="";
        //The number of rounds the game has run
        int roundNumber=0;
        //select strat
        Random random = new Random();
        //determining strat
        int strat = random.nextInt(2);
        //cheacking for user input and running the cooperate/defect function
        while (roundGo==true){
            //setting up keyboard
            Scanner keyboard = new Scanner(System.in);
            //setting the users option
            String userPlay = keyboard.nextLine();
            //making sure that user input is not <1
            if (userPlay.length()==1){
                //makin sure user input is not >1
                if (userPlay.charAt(0)=='1'){
                    System.out.println("You have chosen to cooperate");
                    //if round = 0 the it will alwyas be defect-cooperate as the CPU always starts with defect
                    if (roundNumber==0){
                        //increaseing round
                        roundNumber++;
                        //PLAYERcooperateCPUdefect
                        playerYears=playerYears+5;
                        CPUyears=CPUyears+0;
                        //displaying the years gained to scentance and CPU option
                        System.out.println("CPU has chosen defect");
                        System.out.println(playerYears);  
                        System.out.println(CPUyears);
                        //adding array
                        String [] newArr = {userPlay};
                        System.out.println(Arrays.toString(newArr));
                    } else{
                        cpuPlay = newArr[roundNumber-1];
                    }
                    //if userplay is defect
                } else if (userPlay.charAt(0)=='2'){
                    System.out.println("You have chosen to defect");
                    //if round = 0 then it will alwyas be double defect as the CPU always starts with defect
                    if (roundNumber==0){
                        //increaseing round
                        roundNumber++;
                        //PLAYERdefectCPUdefect
                        playerYears=playerYears+2;
                        CPUyears=CPUyears+2;
                        //displaying the years gained to scentance and CPU option
                        System.out.println("CPU has chosen defect");
                        System.out.println(playerYears);  
                        System.out.println(CPUyears);
                        //adding array
                        String [] myArray = {userPlay};
                        System.out.println(Arrays.toString(myArray));
                    } else{
                        
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