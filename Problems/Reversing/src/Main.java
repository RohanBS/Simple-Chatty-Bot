import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        int reverse = ones * 100 + tens * 10 + hundreds * 1;

        System.out.println(reverse);
    }
}