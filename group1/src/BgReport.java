import java.util.Scanner;

public class BgReport {

    public static void reportBg(String name, int birthYear, int startYear) {
        boolean isValidName = name.length() >= 2;
        boolean isValidBirth = (1900 <= birthYear) && (birthYear <= 2022);

        boolean isValidStart = (1900 <= startYear) && (startYear <= 2022)
                                && (startYear - birthYear >= 18);

        String nameOutput = "INVALID";
        String birthOutput = "INVALID";
        String startOutput = "INVALID";

        if (isValidName) {
            nameOutput = name;
        }

        if (isValidBirth) {
            birthOutput = birthYear + "";
        }

        if (isValidBirth && isValidStart) {
            startOutput = startYear + "";
        }

        System.out.println("Name: " + nameOutput);
        System.out.println("Birth year: " + birthOutput);
        System.out.println("Start year: " + startOutput);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthYear = scan.nextInt();
        int startYear = scan.nextInt();
        reportBg(name, birthYear, startYear);
    }
}
