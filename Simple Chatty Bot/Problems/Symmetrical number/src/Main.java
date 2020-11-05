import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        String reversed = new StringBuilder(num).reverse().toString();

        if (reversed.equals(num)) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}