import java.util.*;

public class q1_perm {

    static void rec(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            rec(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        rec(s, "");
    }
}
