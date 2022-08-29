import java.util.Scanner;

class Positive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the number : ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("This number is a positive number");
        } else if (a == 0) {
            System.out.println("This number is a zero");
        } else if (a < 0) {
            System.out.println("This number is a negative number");
        }
    }
}