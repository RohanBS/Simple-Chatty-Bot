import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.println(upperCaseInput.startsWith("J"));
    }
}