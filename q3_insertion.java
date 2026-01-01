import java.util.*;

public class q3_insertion {

    public static void main(String[] args) {
        String[] a = {"dog","cat","apple"};

        for (int i = 1; i < a.length; i++) {
            String key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j].compareTo(key) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println(Arrays.toString(a));
    }
}
