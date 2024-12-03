import java.util.Scanner;

public class TheVoiceSU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= n ; ++i) {
            int sex = sc.nextInt();
            int point1 = sc.nextInt();
            int point2 = sc.nextInt();
            // 1. point1 & not point2
            if (point1 > 8 && point2 <= 8) {
                if (count1 < k) {
                    System.out.println(i + " " + 1);
                    count1++;
                }
            }
            // 2. not point1 & point2
            else if (point1 <= 8 && point2 > 8) {
                if (count2 < k) {
                    System.out.println(i + " " + 2);
                    count2++;
                }
            }
            // 3. point1 & point2
            else if (point1 > 8 && point2 > 8) {
                if (sex == 1) {
                    if (count1 < k) {
                        System.out.println(i + " " + 1);
                        count1++;
                    } else if (count2 < k) {
                        System.out.println(i + " " + 2);
                        count2++;
                    }
                }
                if (sex == 2) {
                    if (count2 < k) {
                        System.out.println(i + " " + 2);
                        count2++;
                    } else if (count1 < k) {
                        System.out.println(i + " " + 1);
                        count1++;
                    }
                }
            }
            // 4. not point1 & not point2
        }
    }
}