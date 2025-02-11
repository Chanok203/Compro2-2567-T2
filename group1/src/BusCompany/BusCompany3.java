package BusCompany;

import java.util.Scanner;

class Bus3 {
    String name;
    int type; // 1=Fan, 2=P1, 3=VIP
    private int nSeats;
    private int nReserved;
    private boolean isActive;

    public Bus3(String name, int type, int nSeats) {
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

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus3[] buses = new Bus3[Q+1];
        // 0, 1, 2, ..., Q-1, Q
        for (int q = 1; q <= Q; ++q) {
            String id = sc.next();
            int type = sc.nextInt();
            int seats = sc.nextInt();
            buses[q] = new Bus3(id, type, seats);
        }

        int N = sc.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = sc.nextInt();
            int K = sc.nextInt();
            int T = sc.nextInt();

            if (P == 1) {
                boolean found = false;
                for (int q = 1; q <= Q; ++q) {
                    
                    if (buses[q].type != T) {
                        continue;
                    }

                    boolean res = buses[q].reserve(K);
                    if (res == true) {
                        System.out.println(buses[q].name);
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("sorry");
                }
            }
            else if (P == 2)
                buses[T].sendToRepair();
            else if (P == 3)
                buses[T].backToService();

            
        }
    }
}
