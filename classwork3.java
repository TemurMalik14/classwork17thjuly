import java.util.Scanner;
//power masala 5
public class classwork3 {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
            return a * power(a, n - 1);
        }
    }
