import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int i = 2;
        int q = 1;

        while (q <= m) {
            System.out.println(q);
            q = i * i;
            i++;
        }
    }
}