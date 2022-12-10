
import java.util.*;

public class Input {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // input a string
            String name = sc.next();
            System.out.println(name);

            // input a line
            String line = sc.nextLine();
            System.out.println(line);

            // input a integer
            int a = sc.nextInt();
            System.out.println(a);

            // input a float
            float b = sc.nextFloat();
            System.out.println(b);
        }

    }
}
