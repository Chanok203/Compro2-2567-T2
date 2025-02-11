import java.util.Scanner;

public class ProcessInfo {
    static boolean listProcesses(String[] names, int[] ramUses, int totalRAM) {
        int sum = 0;
        for (int i = 0; i < names.length; ++i) {
            System.out.print(names[i]);
            if (ramUses[i] >= 10) {
                System.out.print("*");
            }
            System.out.println(" " + ramUses[i]);
            sum += ramUses[i];
        }
        System.out.printf("RAM used = %d out of %d", sum, totalRAM);
        System.out.println();
        return sum <= totalRAM;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];
        for (int i = 0; i < N; ++i) {
            names[i] = scan.next();
            ramUses[i] = scan.nextInt();
        }
        int totalRAM = scan.nextInt();
        boolean isEnoughRAM = listProcesses(names, ramUses, totalRAM);
        if (isEnoughRAM) {
            System.out.println("Sufficient RAM");
        } else {
            System.out.println("Not enough RAM");
        }
    }
}
