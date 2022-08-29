import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, mul = 1;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        System.out.print("= ");
        for (i = n; i >= 2; i--) {
            mul *= i;
            System.out.print(i + " * ");
        }
        System.out.print("1\n= " + mul);
    }
}