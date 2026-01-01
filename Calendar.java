import java.time.*;

class Calendar {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        LocalDate d = LocalDate.of(y, m, 1);
        int day = d.getDayOfWeek().getValue();

        System.out.println("S M T W T F S");
        for (int i = 1; i < day; i++)
            System.out.print("  ");

        int len = d.lengthOfMonth();
        for (int i = 1; i <= len; i++) {
            System.out.print(i + " ");
            if ((i + day - 1) % 7 == 0)
                System.out.println();
        }
    }
}
