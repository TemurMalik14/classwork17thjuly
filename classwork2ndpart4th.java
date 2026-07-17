import java.util.Scanner;

public class classwork2ndpart4th {

    public static void main(String[] args) {
        classswork4 myobj = new classswork4();
        Scanner input = new Scanner(System.in);
  System.out.print("Enter n value: ");
        int n = input.nextInt();
        int result = myobj.fib(n);
        System.out.println("result: " + result);
    }

}