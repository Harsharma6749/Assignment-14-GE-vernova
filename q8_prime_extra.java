import java.util.*;

public class q8_prime_extra {

    static boolean pal(int n) {
        int r = 0, t = n;
        while (t > 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }
        return r == n;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++)
            if (q7_prime.prime(i) && pal(i))
                System.out.print(i + " ");
    }
}
