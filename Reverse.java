import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        int reverse = 0;
        while (a != 0 ){
            reverse = (reverse * 10) + (a % 10);
            a = a / 10 ;
        }
        System.out.println("\nThe reverse of the given number is = " + reverse);
        input.close();

    }
}
