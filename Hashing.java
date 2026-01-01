import java.util.*;

class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>[] a = new LinkedList[11];

        for (int i = 0; i < 11; i++)
            a[i] = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x % 11].add(x);
        }

        int s = sc.nextInt();
        int k = s % 11;

        if (a[k].contains(s))
            a[k].remove((Integer)s);
        else
            a[k].add(s);

        for (int i = 0; i < 11; i++)
            System.out.println(a[i]);
    }
}
