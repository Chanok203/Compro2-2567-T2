import java.util.Scanner;

public class UnderLine1 {

    public static void printUnderscore1() {
        printUnderscore2(20);
    }

    public static void printUnderscore2(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String w = sc.next();

            System.out.println(w);
            printUnderscore1();
        }
    }
}
