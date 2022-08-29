public class spy2 {
    public static int spy(int x) {
        int mul = 1, sum = 0, r;
        while (x > 0) {
            r = x % 10;
            sum += r;
            mul *= r;
            x /= 10;
        }
        if (sum == mul) {
            return 1;
        } else {
            return 0;
        }
    }
}