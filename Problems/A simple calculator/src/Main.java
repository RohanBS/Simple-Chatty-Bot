import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        String operator = sc.next();
        long num2 = sc.nextLong();

        switch (operator) {
            case "+":
                long sum = num1 + num2;
                System.out.println(sum);
                break;
            case "-":
                long diff = num1 - num2;
                System.out.println(diff);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    long div = num1 / num2;
                    System.out.println(div);
                }
                break;
            case "*":
                long prod = num1 * num2;
                System.out.println(prod);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}