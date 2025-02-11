package BusCompany;

import java.util.Scanner;

class Bus1 {
    String name;
    int type; // 1=Fan, 2=P1, 3=VIP
    int nSeats;
    int nReserved;
    boolean isActive;

    public Bus1(String name, int type, int nSeats) {
        this.name = name;
        this.type = type;
        this.nSeats = nSeats;
        this.nReserved = 0;
        this.isActive = true;
    }

    void printStats() {
        // Name
        System.out.println(this.name);

        // Type
        if (this.type == 1) {
            System.out.println("Fan");
        } else if (this.type == 2) {
            System.out.println("P1");
        } else {
            System.out.println("VIP");
        }

        // Seats
        System.out.println(this.nReserved + " " + this.nSeats);

        // Status
        if (this.isActive) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus1 b = new Bus1(id, type, seats);
        b.printStats();
    }
}
