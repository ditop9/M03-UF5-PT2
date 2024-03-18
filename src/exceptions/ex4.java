package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: No és un caràcter vàlid.");
                break;
            }
            try {
                imprimirPositiu(num);
            } catch (Exception e) {
                System.out.println("El número és negatiu");
            }
            try {
                imprimirNegatiu(num);
            } catch (Exception e) {
                System.out.println("El número és positiu");
            }
        } while (true);
    }
    static void imprimirPositiu(int p) throws Exception {
        if (p < 0) {
            throw new Exception();
        } else System.out.println(p);
    }
    static void imprimirNegatiu(int n) throws Exception {
        if (n >= 0) {
            throw new Exception();
        } else System.out.println(n);
    }
}
