import java.io.*;
import java.util.*;

class OrderedList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("num.txt");
        Scanner fs = new Scanner(f);
        LinkedList<Integer> list = new LinkedList<>();

        while (fs.hasNextInt())
            list.add(fs.nextInt());

        Collections.sort(list);

        int n = sc.nextInt();

        if (list.contains(n))
            list.remove((Integer)n);
        else {
            int i = 0;
            while (i < list.size() && list.get(i) < n)
                i++;
            list.add(i, n);
        }

        FileWriter fw = new FileWriter("num.txt");
        for (int x : list)
            fw.write(x + " ");

        fw.close();
    }
}
