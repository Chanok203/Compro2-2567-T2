import java.util.Scanner;

class Content {
    String name;
    int price;

    public Content(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void updatePrice(int newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        }
    }

    void printSummary() {
        System.out.println(this.name + " " + price);
    }

}

class Food {
    String name;
    Content[] contents;

    public Food(String name, Content[] contents) {
        this.name = name;
        this.contents = contents;
    }

    void printSummary() {
        int price = 0;
        for (int i = 0; i < this.contents.length; ++i) {
            price += this.contents[i].price;
        }
        System.out.println(this.name + " " + price);
    }
}

public class FoodMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Preparation
        // List of Contents
        int numContents = sc.nextInt();
        Content[] contents = new Content[numContents];
        for (int i = 0; i < contents.length; ++i) {
            String name = sc.next();
            int price = sc.nextInt();
            contents[i] = new Content(name, price); // comment
        }

        // List of Food
        int numFoods = sc.nextInt();
        Food[] foods = new Food[numFoods];
        for (int i = 0; i < foods.length; ++i) {
            String name = sc.next();
            int numFoodContents = sc.nextInt();
            Content[] foodContents = new Content[numFoodContents];
            for (int j = 0; j < foodContents.length; ++j) {
                int contentId = sc.nextInt();
                foodContents[j] = contents[contentId]; // comment
            }
            foods[i] = new Food(name, foodContents); // comment
        }

        // Open Comment All????
        while (true) {
            int contentId = sc.nextInt();

            if (contentId == -1) {
                break;
            }

            int newPrice = sc.nextInt();
            contents[contentId].updatePrice(newPrice);
            contents[contentId].printSummary();
        }

        // Close
        for (int i = 0; i < foods.length; ++i) {
            foods[i].printSummary();
        }

        sc.close();

    }
}
