import java.util.Scanner;

public class Decode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String map = sc.nextLine();
        String msg = sc.nextLine();

        int L = msg.length();
        boolean print = false;
        for (int i = 0; i < L - 1; ++i) {
            int c1 = (int) msg.charAt(i);
            int c2 = (int) msg.charAt(i + 1);

            // boolean isdigit1 = Character.isDigit(c1);
            // boolean isdigit2 = Character.isDigit(c2);
            boolean isdigit1 = ('0' <= c1 && c1 <= '9');
            boolean isdigit2 = ('0' <= c2 && c2 <= '9');
            if (!isdigit1 || !isdigit2) {
                if (print) {
                    System.out.print("_");
                    print = false;
                }
                continue;
            }

            // String code = String.format("%c%c", c1, c2);
            // int idx = Integer.parseInt(code);
            int idx = (10 * (c1 - (int) '0')) + (c2 - (int) '0');

            char c = map.charAt(idx);
            System.out.print(c);
            print = true;
            i++;
        }
        sc.close();
    }
}
