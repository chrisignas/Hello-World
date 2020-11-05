import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrder = h1 >= h2 && h2 >= h3;
        boolean ascOrder = h1 <= h2 && h2 <= h3;

        boolean inOrder = descOrder || ascOrder;

        System.out.println(inOrder);
    }
}