//write a program to input 2 nums & print their sum
import java.util.Scanner;
public class Printsum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
                int num1 = sc.nextInt();

                System.out.println("enter number2:");
                        int num2 = sc.nextInt();
        int sum = num1+ num2;

                System.out.println("sum:" +sum);
                sc.close();
    }
}
