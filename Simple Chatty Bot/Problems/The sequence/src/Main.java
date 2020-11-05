import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int userInput = 0;

        max = userInput;

        while (scanner.hasNext() && userInput <= 30_000) {
            userInput = scanner.nextInt();
            if (userInput > max && userInput % 4 == 0 && userInput <= 10_000) {
                max = userInput;
            }
        }
        System.out.println(max);
    }
}