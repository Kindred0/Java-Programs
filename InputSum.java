import java.util.Scanner;

public class InputSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x , y;
        System.out.print("\nEnter a number : ");
        x = input.nextInt();
        System.out.print("\nEnter another number : ");
        y = input.nextInt();
        System.out.println("\nThe Sum of the given numbers is : " + (x + y));
        input.close();
    }
}
