import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        boolean twoOneThree = int2 >= int1 && int1 >= int3;
        boolean threeOneTwo = int3 >= int1 && int1 >= int2;

        boolean properOrder = twoOneThree || threeOneTwo;

        System.out.println(properOrder);
    }
}