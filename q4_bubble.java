import java.util.*;

public class q4_bubble {

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1};

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }

        System.out.println(Arrays.toString(a));
    }
}
