import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int readySum = 0;
        int fixSum = 0;
        int rejectSum = 0;
        for (int i = 0; i < n; i++) {
            int check = sc.nextInt();
            if (check == 0) {
                readySum += 1;
            }
            if (check == 1) {
                fixSum += 1;
            }
            if (check == -1) {
                rejectSum += 1;
            }
        }
        System.out.println(readySum + " " + fixSum + " " + rejectSum);
    }
}