import java.util.*;

class QueueAna {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(17);
        q.add(71);

        while (!q.isEmpty())
            System.out.println(q.remove());
    }
}
