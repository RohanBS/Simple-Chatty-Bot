import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double count = 0;
        double sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        double average = sum / count;
        System.out.println(average);

    }
}