import java.util.Scanner;

class Food {
    String foodName;
    // ! ส่วนที่จะใช้ใน Quiz
    String[] contents;
    int[] ws;
    int numContent;
    // ! ----------------
    
    public Food(String foodName, String content, int w) {
        this.foodName = foodName;
        // ! ส่วนที่จะใช้ใน Quiz
        this.contents = new String[3];
        this.ws = new int[3];
        numContent = 0;
        // ! ----------------
        this.addContent(content, w);
    }

    public void addContent(String content, int w) {
        // ! ส่วนที่จะใช้ใน Quiz
        this.contents[this.numContent] = content;
        this.ws[this.numContent] = w;
        this.numContent++;
        // ! ----------------
    }

    public void printInfo() {
        System.out.println(this.foodName);

        int sumW = 0;
        for (int i = 0; i < this.numContent; ++i) {
            sumW += this.ws[i];
        }
        System.out.println(sumW);

        String line = this.contents[0];
        for (int i = 1; i < this.numContent; ++i) {
            line += " " + this.contents[i];
        }
        System.out.println(line);

    }

}

public class FoodContent3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String foodName = scan.next();
        String content1 = scan.next();
        int w1 = scan.nextInt();

        Food fd = new Food(foodName, content1, w1);

        int q = scan.nextInt();
        while (q != 0) {
            if (q == 1) {
                fd.printInfo();
            } else if (q == 2) {
                String content = scan.next();
                int w = scan.nextInt();
                fd.addContent(content, w);
            }
            q = scan.nextInt();
        }
    }
}
