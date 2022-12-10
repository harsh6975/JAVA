import java.util.*;

class Condition {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                System.out.println("Equal");
            } else if (a > b) {
                System.out.println("Greater");
            } else {
                System.out.println("Less");
            }

        }

    }
}