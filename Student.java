import java.util.Scanner;
public class Student {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT DETAILS");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter register num: ");
        int num = sc.nextInt();
    }
}
