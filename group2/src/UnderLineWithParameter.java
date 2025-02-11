import java.util.Scanner;

public class UnderLineWithParameter {

    public static void printLine2(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            String w = sc.next();
            int n2 = sc.nextInt();

            System.out.println(w);
            printLine2(n2);
        }
    }
}
