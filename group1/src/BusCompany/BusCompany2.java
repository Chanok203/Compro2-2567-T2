package BusCompany;

import java.util.Scanner;

class Bus2 {
    String name;
    int type; // 1=Fan, 2=P1, 3=VIP
    int nSeats;
    int nReserved;
    boolean isActive;

    public Bus2(String name, int type, int nSeats) {
        this.name = name;
        this.type = type;
        this.nSeats = nSeats;
        this.nReserved = 0;
        this.isActive = true;
    }

    public void printStats() {
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
        if (this.isActive) { // this.isActive == true
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }

    public boolean reserve(int k) {
        if (k < 1) {
            return false;
        }

        if (!this.isActive) { // this.isActive == false
            return false;
        }

        int newNReserved = this.nReserved + k;
        if (this.nSeats < newNReserved) {
            return false;
        }

        this.nReserved = newNReserved;
        return true;
    }

    public void sendToRepair() {
        this.isActive = false;
    }

    public void backToService() {
        this.isActive = true;
    }
}

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus2 b = new Bus2(id, type, seats);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1)
                b.reserve(K);
            else if (P == 2)
                b.sendToRepair();
            else if (P == 3)
                b.backToService();
            b.printStats();
        }
    }
}
