
import java.util.*;

public class Function {

    public static void PrintName(String name) {
        System.out.println(name);
        return;
    }

    public static int PrintAge(int age) {

        return age;
    }

    public static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        PrintName("Harsh sinha");
        int age = PrintAge(18);
        System.out.println(age);

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("sum of two nos " + findSum(a, b));
        }

    }
}
