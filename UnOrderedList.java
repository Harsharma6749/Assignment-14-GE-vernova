import java.io.*;
import java.util.*;

class UnOrderedList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("data.txt");
        Scanner fs = new Scanner(f);
        LinkedList<String> list = new LinkedList<>();

        while (fs.hasNext())
            list.add(fs.next());

        String w = sc.next();

        if (list.contains(w))
            list.remove(w);
        else
            list.add(w);

        FileWriter fw = new FileWriter("data.txt");
        for (String s : list)
            fw.write(s + " ");

        fw.close();
    }
}
