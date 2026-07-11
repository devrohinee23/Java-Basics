import java.util.*;
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " is Even Number.");
        } else {
            System.out.println(a + " is Odd Number.");
        }
    }
}
