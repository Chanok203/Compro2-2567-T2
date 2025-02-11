import java.util.Scanner;

class Food {
    String foodName;
    String[] contents;
    int[] ws;
    int nContent;

    Food(String foodName, String content, int w) {
        this.foodName = foodName;

        this.contents = new String[3];
        this.ws = new int[3];

        this.contents[0] = content;
        this.ws[0] = w;
        this.nContent = 1;
    }

    void addContent(String content, int w) {
        this.contents[this.nContent] = content;
        this.ws[this.nContent] = w;
        this.nContent++;
    }

    void printInfo() {
        // find sum of W
        int sumW = 0;
        for (int i = 0; i < nContent; ++i) {
            sumW += this.ws[i];
        }

        // concat contentName
        String allContent = this.contents[0];
        for (int i = 1; i < nContent; ++i) {
            allContent += " " + this.contents[i];
        }

        System.out.println(this.foodName);
        System.out.println(sumW);
        System.out.println(allContent);
    }
}

public class FoodContents1 {
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
