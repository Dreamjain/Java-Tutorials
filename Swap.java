import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A: ");
        int a = input.nextInt();
        System.out.print("enter the value of b: ");
        int b = input.nextInt();
        /*
        only if our no. is more than 0
        if no. is 0 then we have to use temporary variable
         */
        a = a*b;
        b = a/b;
        a = a/b;
       System.out.print("Value of a = "+a+"\nValue of b = "+b);
    }
}