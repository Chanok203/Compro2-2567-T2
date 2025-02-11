import java.util.Scanner;

public class CardPair2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            String p1 = sc.next();
            int p1_c1 = (int) p1.charAt(0);
            int p1_c2 = (int) p1.charAt(1);

            String p2 = sc.next();
            int p2_c1 = (int) p2.charAt(0);
            int p2_c2 = (int) p2.charAt(1);

            boolean isPair1 = (p1_c1 == p1_c2);
            boolean isPair2 = (p2_c1 == p2_c2);

            if (isPair1 && !isPair2) {
                System.out.print("W");
            } else if (!isPair1 && isPair2) {
                System.out.print("L");
            } else {
                int S1 = p1_c2;
                if (p1_c1 <= p1_c2) {
                    S1 = p1_c1;
                }

                int S2 = p2_c2;
                if (p2_c1 <= p2_c2) {
                    S2 = p2_c1;
                }

                if (S1 < S2) {
                    System.out.print("W");
                } else if (S1 == S2) {
                    System.out.print("D");
                } else {
                    System.out.print("L");
                }
            }
        }
    }

}
