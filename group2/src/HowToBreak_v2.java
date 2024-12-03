import java.util.Scanner;

public class HowToBreak_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        // for (;;) {
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
