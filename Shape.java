import java.util.Scanner;

public class Shape {
    static float ComputeArea(float side){
        return side * side;
    }
    static float ComputeArea(float length, float breadth){
        return length * breadth;
    }
    static double ComputeArea(double radius){
        return radius * radius * 3.14 ;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        if (args[0] == " Square" || args[0] == "square"){
            float side;
            System.out.print("Enter the side of the sqaure : ");
            side = input.nextFloat();
            System.out.println("\nThe Area of the Square is : " + ComputeArea(side));
        }
        else if (args[0] == "Rectangle" || args[0] == "rectangle"){
            float length, breadth;
            System.out.print("Enter the length of the rectangle : ");
            length = input.nextFloat();
            System.out.print("Enter the breadth of the rectangle : ");
            breadth = input.nextFloat();
            System.out.println("\nThe Area of the Rectangle is : " + ComputeArea(length , breadth));
        }
        else if (args[0] == "Circle" || args[0] == "circle"){
            double radius;
            System.out.print("Enter the radius of the circle : ");
            radius = input.nextDouble();
            System.out.println("\nThe Area of the Circle is : " + ComputeArea(radius));
        }
        else 
            System.out.println("No such Shape");
        input.close();
    }
}
