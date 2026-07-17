import java.util.Scanner;

public class ndpartof4thtask {
    public static void main(String[] args) {
        stpart4thtask myobj = new stpart4thtask();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int result=myobj.countDigits(n);
        System.out.println("result: "+result);

     }
}
