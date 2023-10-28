/**
 * Write a description of class DefectMirrorGame here.
 *
 * @author Peter Day
 * @version (a version number or a date)
 */
public class DefectMirrorGame implements Game
{
    // instance variables - replace the example below with your own
    Choice nextComputerChoice;
    Choice previousPlayerChoice;
    public DefectMirrorGame()
    {
        nextComputerChoice=Choice.DEFECT;
    }
    public String strategy(){
        return "play your previous move against you.";
    }
    public Choice play(Choice choice)
    {
        nextComputerChoice=previousPlayerChoice;
        previousPlayerChoice=choice;
        return nextComputerChoice;
    }
}