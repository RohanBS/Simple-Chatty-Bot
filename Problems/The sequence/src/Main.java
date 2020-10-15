import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int cn = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (cn >= num) {
                    break;
                }
                cn++;
                System.out.print((i + 1) + " ");
            }
        }
    }
}