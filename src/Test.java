import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Calculator<Integer> numbers = new Calculator<>();
        System.out.println("====>Arithmatic calculator<====");
        int userValue = -1;
        do{
            System.out.println("Enter 1 to sum the numbers");
            System.out.println("Enter 2 to multiply the numbers");
            System.out.println("Enter 3 to subraction the numbers");
            System.out.println("Enter 4 to division the numbers");
            System.out.println("Enter 0 to exit");
            System.out.print("Enter your Choice  ");
            userValue = s.nextInt();
            s.nextLine();
            System.out.print("Enter 2 numbers seprated by space: ");
            String str = s.nextLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            switch (userValue) {
                case 1:
                    System.out.println("Sum of 2 numbers are: " + numbers.add(a, b));
                    break;
                case 2:
                    System.out.println("Multiplication of 2 numbers are: " + numbers.multiply(a, b));
                    break;
                case 3:
                    System.out.println("Subtraction of 2 numbers are: " + numbers.subtract(a, b));
                    break;
                case 4:
                    System.out.println("Division of 2 numbers are: " + numbers.division(a, b));
                    break;
            }
        }while(userValue != 0);
    }
}
