package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        run();
    }
    static void run() {
        calculator();
    }
    static void ui() {
        System.out.println("""
                OPERADOR
                
                ==  +  ==
                ==  -  ==
                ==  *  ==
                ==  /  ==""");
    }
    static void calculator() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        char operator = 0;
        int num2 = 0;
        try {
            System.out.println("Introdueix el primer número");
            num1 = sc.nextInt();
            ui();
            operator = sc.next().charAt(0);
            System.out.println("Introdueix el segon número");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: No s'ha introduït els caràcters correctes");
        }
        int result = 0;
        switch (operator) {
            case '+':
                result = sum(num1, num2);
                System.out.println("Resultat de la suma: " + result);
                break;
            case '-':
                result = substract(num1, num2);
                System.out.println("Resultat de la resta: " + result);
                break;
            case '*':
                result = multiplication(num1, num2);
                System.out.println("Resultat de la multiplicació: " + result);
                break;
            case '/':
                try {
                    result = divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: No es pot dividir per 0");
                    run();
                }
                System.out.println("Resultat de la divisió: " + result);
                break;
                default:
                System.out.println("Error: No s'ha introduït una opció vàlida. Intenta-ho de nou");
                break;
        }
    }
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    static int substract(int num1, int num2) {
        return num1 - num2;
    }
    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}
