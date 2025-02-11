import java.util.Scanner;

public class AgeReport {

    static int reportAge(int[] IDs, int[] ages, int min, int max) {
        int count = 0;
        for (int i = 0; i < IDs.length; ++i) {
            if ( min <= ages[i] && ages[i] <= max ) {
                System.out.println(IDs[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] IDs = new int[N];
        int[] ages = new int[N];

        for (int i = 0; i < N; ++i) {
            IDs[i] = sc.nextInt();
            ages[i] = sc.nextInt();
        }
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        int P = reportAge(IDs, ages, Y1, Y2);
        String line = String.format("There are %d persons in age range of %d to %d", P, Y1, Y2);
        System.out.println(line);
    }
}
