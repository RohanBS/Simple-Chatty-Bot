import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] str = new int[4];
        for (int i = 0; i < 4; i++) {
            str[i] = scanner.nextInt();
            System.out.print(str[i] - 1 + " ");
        }
    }
}