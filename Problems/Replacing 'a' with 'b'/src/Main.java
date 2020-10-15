import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String replaced = str.replace('a', 'b');
        System.out.println(replaced);
    }
}