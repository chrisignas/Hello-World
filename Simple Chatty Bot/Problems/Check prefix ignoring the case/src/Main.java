import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next().toLowerCase();

        System.out.println(line.charAt(0) == 'j');
    }
}