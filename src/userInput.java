import java.util.Scanner;

public class userInput {
    Scanner input = new Scanner(System.in);
    public int[] takeInput(){
        int[] location = new int[2];
        System.out.println("Enter your row number:");
        location[0] = input.nextInt()-1;
        System.out.println("Enter your column number:");
        location[1] = input.nextInt()-1;
        return location;
    }
}
