
import java.util.Scanner;

class Addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, s = 0;
        System.out.println("Enter the 1st no : ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd no : ");
        b = sc.nextInt();
        s = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + s);
    }
}