import java.util.Scanner;
// import java.util.Arrays;

public class DefensiveWall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            int v = sc.nextInt();
            if (v > 0) {
                arr[i] = v;
            }
        }
        int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int idx = sc.nextInt();
            int number = sc.nextInt();
            if (idx < 1 || N < idx) {
                System.out.println("invalid position");
                continue;
            }
            arr[idx] += number;
            System.out.println(arr[idx]);
        }
        int L = sc.nextInt();
        boolean isReady = true;
        for (int i = 1; i <= N; ++i) {
            if (arr[i] < L) {
                isReady = false;
                System.out.print(i + " ");
            }
        }
        if (isReady) {
            System.out.print("ready");
        }
        System.out.println();
        // System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
