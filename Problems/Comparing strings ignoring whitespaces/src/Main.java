import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();
        if (line1.trim().replace(" ", "")
                .equalsIgnoreCase(line2.trim()
                        .replace(" ", ""))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}