import java.util.Scanner;

public class Sum {
    public static void main(String []args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        int c = a + b;
        System.out.println("sum of "+a + ", and "+ b + " is : "+c);

    }
}
