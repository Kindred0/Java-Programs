import java.util.Scanner;

public class Student {
    int number_of_students;
    int Roll_no[];
    String name[];
    float mark[][];
    float total[];
    public Student(int n){
        number_of_students = n;
        Roll_no = new int[n];
        name = new String[n];
        mark = new float[3][n];
        total = new float[n];
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < n ; i++){
            System.out.print("Enter the Roll no of the student in the " + (i + 1) + "th position\t: ");
            Roll_no[i] = input.nextInt();
            System.out.print("Enter the name of the student\t: ");
            name[i] = input.next();
            System.out.print("Enter mark of subject 1\t: ");
            mark[0][i] = input.nextFloat();
            System.out.print("Enter mark of subject 2\t: ");
            mark[1][i] = input.nextFloat();
            System.out.print("Enter mark of subject 3\t: ");
            mark[2][i] = input.nextFloat();
            if (mark[0][i] > 100) 
                mark[0][i] = 100;
            if (mark[1][i] > 100)
                mark[1][i] = 100;
            if (mark[2][i] > 100)
                mark[2][i] = 100;
            if (mark[0][i] < 50 || mark[1][i] < 50 || mark[2][i] < 50)
                total[i] = 0;
            else 
                total[i] = mark[0][i] + mark[1][i] + mark[2][i];
        }
        input.close();
    }
    public void display(){
        System.out.println("|No\t|Name\t|Total\t|");
        for (int i = 0 ; i < number_of_students ; i++){
            System.out.println("|" + Roll_no[i] + "\t|" + name[i] + "\t|" + total[i] + "\t|\n");
        }
    }
    

    public static void main(String arg[]){
        int n;
        System.out.print("Enter the total number of students in the class\t: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Student list = new Student(n);
        list.display();
        input.close();
    }
}