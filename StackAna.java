import java.util.*;

class StackAna {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(17);
        st.push(71);

        while (!st.isEmpty())
            System.out.println(st.pop());
    }
}
