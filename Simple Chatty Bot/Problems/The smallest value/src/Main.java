import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long fact = 1L;
        long count = 1L;

        while (fact <= num) {
            count++;
            fact *= count;
        }
        System.out.println(count);
    }
}