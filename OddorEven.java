import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter a number : ");
        a = input.nextInt();
        if ( a == 0)
            System.out.println("The number is zero");
        else if( a % 2 == 1)
            System.out.println("The number " + a + " is odd");
        else 
            System.out.println("The number " + a + " is even");
        input.close();
    }
    
}
