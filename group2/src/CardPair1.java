import java.util.Scanner;

public class CardPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            String p1 = sc.next();
            int p1_c1 = (int) p1.charAt(0);
            int p1_c2 = (int) p1.charAt(1);

            int S1;
            if (p1_c1 <= p1_c2) {
                S1 = p1_c1;
            } else {
                S1 = p1_c2;
            }
            char c = (char) S1;
            System.out.printf("i=%d, %d %c", i, S1, c);
            System.out.println();
            
            String p2 = sc.next();
            char p2_c1 = p2.charAt(0);
            char p2_c2 = p2.charAt(1);
            // ...
        }
    }
}
