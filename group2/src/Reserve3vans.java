import java.util.Scanner;

public class Reserve3vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0, C = 0; // วันที่รถจะว่าง
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int day = sc.nextInt();
            if (A <= B && A <= C) { // A น้อยที่สุด
                System.out.println("A");
                A += day;
                continue; // ไปรอบต่อไป
            }
            if (B <= A && B <= C) { // B น้อยสุด
                System.out.println("B");
                B += day;
                continue; // ไปรอบต่อไป
            }
            if (C <= A && C <= B) { // C น้อยสุด
                System.out.println("C");
                C += day;
                continue; // ไปรอบต่อไป
            }

        }
    }
}
