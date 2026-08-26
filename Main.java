import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A: ");
        int a = input.nextInt();
        System.out.print("enter the value of b: ");
        int b = input.nextInt();
        a = a*b;
        b = a/b;
        a = a/b;
       System.out.print("Value of a = "+a+"\nValue of b = "+b);
    }
}