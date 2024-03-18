import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("Introdueix la posició de l'array");
        int index;
        try {
            index = sc.nextInt();
            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println("Error: No s'ha introduït un caràcter vàlid.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: No existeix aquesta posició.");
        }
    }
}
