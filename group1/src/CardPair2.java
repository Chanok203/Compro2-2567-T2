public class CardPair2 {
    public static void main(String[] args) {
        int P1_C1 = (int) 'Z';
        int P1_C2 = (int) 'Z';
        int P2_C1 = (int) 'B';
        int P2_C2 = (int) 'A';
        /*
         * 1. คู่ vs คู่
         * 2. คู่ vs เดี่ยว
         * 3. เดี่ยว vs คู่
         * 4. เดี่ยว vs เดี่ยว
         */
        boolean isPair1 = (P1_C1 == P1_C2);
        boolean isPair2 = (P2_C1 == P2_C2);

        if (isPair1 && isPair2) {
            // ....(ทำแบบข้อ 1)
        } else if (isPair1 && !isPair2) {
            // 1 win
        } else if (!isPair1 && isPair2) {
            // 2 win
        } else if (!isPair1 && !isPair2) {
            // ...(ทำแบบข้อ 1)
        }
        
        // หรือ
        
        if (isPair1 && !isPair2) {
            // 1 win
        } else if (!isPair1 && isPair2) {
            // 2 win
        } else {
            // ...(ทำแบบข้อ 1)
        }
        
    }
}
