import java.util.Scanner;

public class Multiply Multiply{
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        int c = a * b;
        System.out.println("multiplication of "+a + ", and "+ b + " is : "+c);

    }
}