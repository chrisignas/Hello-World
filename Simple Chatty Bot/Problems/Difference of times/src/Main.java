import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        int firstHourInSeconds = hour1 * 3600 + minute1 * 60 + second1;
        int secondHourInSeconds = hour2 * 3600 + minute2 * 60 + second2;

        int differenceInTime = secondHourInSeconds - firstHourInSeconds;

        System.out.println(differenceInTime);
    }
}