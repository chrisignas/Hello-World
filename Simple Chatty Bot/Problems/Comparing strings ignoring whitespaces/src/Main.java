import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String trimLine1 = line1.trim().replace(" ", "");
        String trimLine2 = line2.trim().replace(" ", "");

        System.out.println(trimLine1.equals(trimLine2));

    }
}