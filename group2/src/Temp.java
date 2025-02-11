import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; ++i) {
            String msg = sc.nextLine();
            System.out.printf("i=%d, msg=%s", i, msg);
            System.out.println();
        }
    }
}
