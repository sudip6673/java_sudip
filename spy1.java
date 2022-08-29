import java.util.Scanner;

class spy1 {
    public static void main(String args[]) {
        int n, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        spy2 obc = new spy2();
        p = obc.spy(n);
        if (p == 1) {
            System.out.println("This number is a spy number");
        } else {
            System.out.println("This number is not a spy number");
        }
    }
}