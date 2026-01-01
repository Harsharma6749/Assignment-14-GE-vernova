import java.util.*;

public class q6_anagram {

    public static void main(String[] args) {
        String a = "heart";
        String b = "earth";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x, y));
    }
}
