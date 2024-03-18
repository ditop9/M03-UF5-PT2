import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try {
            forceInputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println(e + "\nError: No s'ha proporcionat un valor numéric");
        }
    }
    public static void forceInputMismatchException() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + 1);
    }
}