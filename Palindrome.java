import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Deque<Character> dq = new ArrayDeque<>();

        for (char c : s.toCharArray())
            dq.addLast(c);

        boolean ok = true;
        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                ok = false;
                break;
            }
        }
        System.out.println(ok);
    }
}
