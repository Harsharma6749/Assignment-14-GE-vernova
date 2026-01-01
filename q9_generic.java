import java.util.*;

public class q9_generic {

    static <T extends Comparable<T>> void sort(T[] a) {
        Arrays.sort(a);
    }

    static <T> boolean search(T[] a, T k) {
        for (T x : a)
            if (x.equals(k)) return true;
        return false;
    }

    public static void main(String[] args) {
        Integer[] a = {3,1,2};
        sort(a);
        System.out.println(search(a, 2));
    }
}
