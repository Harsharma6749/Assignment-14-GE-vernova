import java.util.*;

public class q11_task {

    public static void main(String[] args) {
        int[][] t = {{4,5},{2,3},{1,2}};
        Arrays.sort(t, Comparator.comparingInt(a -> a[1]));

        int time = 0, max = 0;
        for (int[] x : t) {
            time += x[0];
            max = Math.max(max, time - x[1]);
        }

        System.out.println(max);
    }
}
