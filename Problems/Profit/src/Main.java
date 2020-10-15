import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        double mon = myobj.nextDouble();
        double per = myobj.nextDouble();
        double ext = myobj.nextDouble();
        int years = 0;
        while (true) {
            if (mon > ext || mon == ext) {
                break;
            }
            mon = mon * (1 + per / 100);
            years++;
        }
        System.out.print(years);
    }
}