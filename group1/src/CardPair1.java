import java.util.Scanner;

public class CardPair1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scoreA = 'A';
        
        for (int i = 0; i < 5; ++i) {
            String p1 = sc.next();
            // String p2 = sc.next();

            int p1_C1 = (int) p1.charAt(0);
            int p1_C2 = (int) p1.charAt(1);
            int S1;
            if (p1_C1 == scoreA || p1_C2 == scoreA) {
                S1 = scoreA;
            } else if (p1_C1 >= p1_C2) {
                S1 = p1_C1;
            } else {
                S1 = p1_C2;
            }
            char C = (char) S1;
            System.out.println(S1 + " " + C);

        }
    }
}