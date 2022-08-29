public class Niven_sudip2 {
    /*
     * public static void main(String args[]) {
     * }
     */

    public static int nive(int x) {
        int r, sum = 0, y;
        y = x;
        while (x > 0) {
            r = x % 10;
            sum += r;
            x /= 10;
        }
        if (y % sum == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}