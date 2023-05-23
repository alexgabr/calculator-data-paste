import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a = read();
        result(calc(a), a);
    }

    public static int read() {
        // variabile
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        q.close();

        return a;
    }

    public static int calc(int a) {
        int x, y, z, t, p, d;

        x = a % 19;
        y = a % 4;
        z = a % 7;
        t = (19 * x + 15) % 30;
        p = (2 * y + 4 * z + 6 * t + 6) % 7;
        d = t + p + 4;

        return d;
    }

    public static void result(int d, int a) {
        if (d <= 30) {
            System.out.println(d + " aprilie " + a);
        } else if (d > 30) {
            System.out.println(d % 10 + " mai " + a);
        }
    }
}
