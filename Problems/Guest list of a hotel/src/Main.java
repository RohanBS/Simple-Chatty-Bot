import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[8];
        for (int i = 0; i < 8; i++) {
            str[i] = sc.next();
        }
        for (int j = 7; j >= 0; j--) {
            System.out.println(str[j]);
        }

    }
}