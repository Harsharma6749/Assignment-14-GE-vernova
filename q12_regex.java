import java.time.*;
import java.util.*;

public class q12_regex {

    public static void main(String[] args) {
        String msg = "Hello <<name>>, We have your full name as <<full name>>. "
                   + "your contact number is 91-xxxxxxxxxx. Thank you BridgeLabz 01/01/2016.";

        Scanner sc = new Scanner(System.in);
        String fn = sc.nextLine();
        String full = sc.nextLine();
        String mob = sc.nextLine();

        msg = msg.replaceAll("<<name>>", fn);
        msg = msg.replaceAll("<<full name>>", full);
        msg = msg.replaceAll("91-xxxxxxxxxx", "91-" + mob);
        msg = msg.replaceAll("\\d{2}/\\d{2}/\\d{4}", LocalDate.now().toString());

        System.out.println(msg);
    }
}
