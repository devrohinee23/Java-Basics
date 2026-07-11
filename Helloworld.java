import java.util.Scanner;

public class Helloworld {
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Message ! ");
        String msg = scan.nextLine();

        System.out.println("Your Message is : " + msg);
    }
}
