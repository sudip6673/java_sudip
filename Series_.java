class Series_ {
    public static void main(String args[]) {
        int i, j, k, l;
        for (l = 5; l >= 1; l--) {
            System.out.print(" ");
        }
        System.out.print("*\n");
        for (i = 1; i <= 5; i++) {
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("**");
            }
            System.out.print("\n");
        }
    }
}