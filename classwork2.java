import java.util.Scanner;
//masala4
public class classwork2 {
    public static int factorial(int n) {
        if (n == 0)
            return 1;            
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        classwork2 myobj = new classwork2();
        Scanner input = new Scanner(System.in);
        System.out.print(" enter n : ");
        int n = input.nextInt();
        int result = myobj.factorial(n);
        System.out.println("the factorial: " + result);
    }
}
