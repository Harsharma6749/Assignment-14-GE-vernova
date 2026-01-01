public class q10_guess {

    static boolean ask(int n, int l, int h) {
        return n >= l && n <= h;
    }

    public static void main(String[] args) {
        int n = 7;
        int l = 0, h = 15;

        while (l <= h) {
            int m = (l + h) / 2;
            System.out.println(m);
            if (m == n) break;
            if (ask(n, l, m - 1)) h = m - 1;
            else l = m + 1;
        }
    }
}
