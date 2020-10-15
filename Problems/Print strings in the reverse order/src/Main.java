import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = sc.nextLine();
        }
        for (int j = 2; j >= 0; j--) {
            System.out.println(str[j]);
        }
    }
}