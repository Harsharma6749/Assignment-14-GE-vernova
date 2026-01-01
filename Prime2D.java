class Prime2D {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] a = new int[10][];
        int k = 0;

        for (int i = 0; i < 10; i++) {
            int[] t = new int[100];
            int c = 0;
            for (int j = i * 100; j < (i + 1) * 100; j++)
                if (prime(j))
                    t[c++] = j;
            a[i] = t;
        }
    }
}
