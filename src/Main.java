import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =
                new Scanner(System.in);
        String s = scanner.nextLine();

        long a = scanner.nextLong();
        System.out.printf("a = " + a);

        labelName: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a > 0) {
                    break labelName;
                }
            }
        }

    }

    void println(){

    }
}
