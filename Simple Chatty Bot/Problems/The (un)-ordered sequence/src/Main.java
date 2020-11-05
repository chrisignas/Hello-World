import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int currentNum;

        // booleans for checking the order
        boolean ascending = true;
        boolean descending = true;

        while ((currentNum = scanner.nextInt()) != 0) {
            if (num > currentNum) {
                ascending = false;
            } else if (num < currentNum) {
                descending = false;
            }
            num = currentNum;
        }
        if (descending || ascending) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}