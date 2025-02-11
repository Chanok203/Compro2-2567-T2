import java.util.Scanner;

public class CovidScreening {
    static void screenCovid(boolean insurance, int severity, int age, int vaccines) {

        if (insurance) {
            System.out.println("RT-PCR recommended");
        }

        if (70 <= age || severity == 3) {
            System.out.println("Hospital admission");
        } else {
            System.out.println("Home isolation");
        }

        if (vaccines < 2 || 2 <= severity) {
            System.out.println("Favipiravia included");
        } else {
            System.out.println("Standard medicine package");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int insurance = scan.nextInt();
        int severity = scan.nextInt();
        int age = scan.nextInt();
        int vaccines = scan.nextInt();
        screenCovid(insurance == 1, severity, age, vaccines);
    }
}
