class Series_st {
    public static void main(String args[]) {
        int i, j, k, l = 1;
        for (i = 5; i >= 1; i--) {
            for (k = 1; k <= l; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            l += 1;
            System.out.println();
        }
    }
}