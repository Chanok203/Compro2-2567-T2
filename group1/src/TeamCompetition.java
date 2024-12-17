import java.util.Arrays;
import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] team1 = new int[N];
        int[] team2 = new int[N];
        for (int i = 0; i < N; ++i) {
            team1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            team2[i] = sc.nextInt();
        }
        // System.out.println("team1: " + Arrays.toString(team1));
        // System.out.println("team2: " + Arrays.toString(team2));

        int S1 = 0;
        int S2 = 0;
        for (int i = 0; i < N; ++i) {
            if (team1[i] > team2[i]) {
                S1 += 2;
            } else if (team1[i] == team2[i]) {
                S1++;
                S2++;
            } else {
                S2 += 2;
            }
            // System.out.println("i="+i+" team1: " + team1[i] + " : " + team2[i] + " team2");
            // System.out.println("S1=" + S1 + ", S2=" + S2);
            // System.out.println("==========================");
        }
        /**
        Team 2 wins
        Score 9 to 1
         */
        if (S1 > S2) {
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d", S1, S2);
            System.out.println();
        } else if (S1 == S2) {
            System.out.println("Draw game");
            System.out.printf("Score %d to %d", S1, S2);
            System.out.println();
        } else {
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d", S2, S1);
            System.out.println();
        }
    }
}
