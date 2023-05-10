import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args) {

        // 0 for rock
        // 1 for Paper
        // 2 for Scissor

    Scanner s  = new Scanner(System.in);
    System.out.println("Enter 0 for Rock");
    System.out.println("Enter 1 for Paper");
    System.out.println("Enter 2 for Scissor");
    
    System.out.print("Enter the Move : ");
    int UserInput = s.nextInt();
    
    
    
    System.out.println();
    
    Random random = new Random();
    int ComputerInput = random.nextInt( 0,3);
    
    
    if (UserInput == ComputerInput) {
        System.out.println("DRAW!!");
    }
    else if (UserInput == 0 && ComputerInput==2 || UserInput == 1 && ComputerInput == 0 || UserInput == 2 && ComputerInput == 1) {
            System.out.println("You Win!!");
        }
        else{
            System.out.println("Computer Wins!!!");
        }

        
        switch (ComputerInput) {
            case 0:
            System.out.println("Computer choose : Rock");
            break;
            case 1:
            System.out.println("Computer choose : Paper");
            break;
            case 2:
            System.out.println("Computer choose : Scissor");
            break;
            default:
                break;
        }
        
        // System.out.println( "Computer Choses :"+ComputerInput);
        
        switch (UserInput) {
            case 0:
            System.out.println("Your choose : Rock");
            break;
            case 1:
            System.out.println("Your choose : Paper");
            break;
            case 2:
            System.out.println("Your choose : Scissor");
            break;
            default:
            System.out.println("Your input in Wrong Please choose the number given above");
                break;
        }
        
    }
}
