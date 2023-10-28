import java.util.Random;
/**
 * Write a description of class RandomGame here.
 *
 * @author Peter Day
 * @version (a version number or a date)
 */
public class RandomGame implements Game
{
    // instance variables - replace the example below with your own

    public RandomGame()
    {
    }
    public String strategy(){
        return "play a random move against you.";
        }
    public Choice play(Choice choice)
    {
        Random random = new Random();
        int rand = random.nextInt(2);
        if (rand == 1){
            return Choice.DEFECT;
        }else {
            return Choice.COOPERATE;
        }
    }
}
