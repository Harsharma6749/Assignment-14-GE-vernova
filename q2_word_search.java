import java.util.*;

public class q2_word_search {

    public static void main(String[] args) {
        String[] arr = {"apple","bat","cat","dog"};
        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);
        String key = sc.next();

        int l = 0, r = arr.length - 1;
        boolean found = false;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m].equals(key)) {
                found = true;
                break;
            }
            if (arr[m].compareTo(key) < 0)
                l = m + 1;
            else
                r = m - 1;
        }

        System.out.println(found);
    }
}
