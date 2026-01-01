import java.util.*;

public class q5_merge {

    static void sort(String[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        sort(a, l, m);
        sort(a, m + 1, r);
        merge(a, l, m, r);
    }

    static void merge(String[] a, int l, int m, int r) {
        String[] t = new String[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = a[i].compareTo(a[j]) < 0 ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        for (int x = 0; x < t.length; x++)
            a[l + x] = t[x];
    }

    public static void main(String[] args) {
        String[] a = {"dog","cat","apple"};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
