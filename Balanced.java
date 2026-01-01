import java.util.*;

class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                st.push(c);
            else if (c == ')') {
                if (st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                st.pop();
            }
        }
        System.out.println(st.isEmpty());
    }
}
