
// Check a number Niven or not
import java.util.Scanner;

class Niven_sudip1 {

    public static void main(String args[]) {
        int n, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        Niven_sudip2 obc = new Niven_sudip2();
        p = obc.nive(n);
        if (p == 1) {
            System.out.println("This number is a niven number");
        } else {
            System.out.println("This number is not a niven number");
        }
    }
}