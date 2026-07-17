import java.util.Scanner;
//masala3
public class Classwork1st {
    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
      }

    public static void main(String[] args) {
        Classwork1st myobj = new Classwork1st();
        Scanner input = new Scanner(System.in);
        System.out.print(" enter n : ");
        int n = input.nextInt();

        int result = myobj.sum(n);
        System.out.println("sum: " + result);
    }
}