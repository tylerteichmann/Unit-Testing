/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        double outcome = Add(2, 4);
        System.out.println(outcome == 6);
    }

    public static double Add(double x, double y) {
        return x + y;
    }

    public static boolean IsPrime(int number) {
        if (number < 2) return false;

        for (int d = 2; d <= Math.sqrt(number); d++) {
            if (number % d == 0) {
                return false; // divisor found
            }
        }
        return true; // no divisor found
    }

    public static void Special(int x) {
        if (x == 2023) {
            throw new NullPointerException("Special");
        } else {
            System.out.println(x);
        }
    }
}