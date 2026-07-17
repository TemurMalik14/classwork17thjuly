import java.util.Scanner;

public class classwork3_part2 {
    public static void main(String[] args) {
        classwork3 myobj = new classwork3();       // class nomi bilan bir xil
        Scanner sc = new Scanner(System.in);

        System.out.print("a qiymatini kirit: ");
        int a = sc.nextInt();
        System.out.print("n qiymatini kirit: ");
        int n = sc.nextInt();

        int result = myobj.power(a, n);
        System.out.println("Natija: " + result);
    }
}
