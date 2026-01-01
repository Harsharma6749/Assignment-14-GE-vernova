import java.util.*;

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int bal = 1000;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            q.add(sc.nextInt());

        while (!q.isEmpty()) {
            int x = q.remove();
            if (x > 0)
                bal += x;
            else
                bal += x;
        }
        System.out.println(bal);
    }
}
