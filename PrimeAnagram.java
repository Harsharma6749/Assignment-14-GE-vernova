import java.util.*;

class PrimeAnagram {
    static boolean ana(int a, int b) {
        char[] x = String.valueOf(a).toCharArray();
        char[] y = String.valueOf(b).toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        for (int i = 10; i < 1000; i++)
            for (int j = i + 1; j < 1000; j++)
                if (ana(i, j))
                    System.out.println(i + " " + j);
    }
}
