import java.util.Scanner;

public class OddVsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < 8; ++i) {
            int n = sc.nextInt();
            if (n % 2 == 0) { // Even
                sumEven += n;
            } else { // Odd
                sumOdd += n;
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("even");
        } else if (sumEven == sumOdd) {
            System.out.println("equal");
        } else {
            System.out.println("odd");
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
