import java.util.Scanner;

public class Diff {
    public static void main(String []args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        int c = a - b;
        System.out.println("difference of "+a + ", and "+ b + " is : "+c);
    }
}
