package exceptions.ex6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaFitxes {
    static ArrayList<Fitxa> llistaFitxes = new ArrayList<>();
    public static void main(String[] args) {
        llistaFitxes.add(new Fitxa("1234A", "Aventura"));
        llistaFitxes.add(new Obra("5387B", "Drama", "Ma rio", (short) 240));
        llistaFitxes.add(new Volum("7389C", "Ciencia", "Lisa", (short) 350, (short) 12));
        llistaFitxes.add(new Revista("8120D", "Salvame", (short) 2024, (short) 232));
        run();
    }
    static void run() {
        int option;
        do {
            ui();
            option = introduceInteger("Escull una opció");
            chooseOption(option);
        } while (option != 0);
    }
    static void ui() {
        System.out.println("""
                ESCULL UNA OPCIÓ
                1. AFEGIR NOVA OBRA
                2. AFEGIR NOVA REVISTA
                3. AFEGIR NOU VOLUM
                4. VEURE LLISTA""");
    }
    static void chooseOption(int option) {
        switch (option) {
            case 1:
                addNewObra();
                break;
            case 2:
                addNewRevista();
                break;
            case 3:
                addNewVolum();
                break;
            case 4:
                showAllList();
                break;
            case 0:
                System.out.println("El programa es tanca...");
                System.exit(0);
                break;
            default:
                System.out.println("Error: No és una opció vàlida.\nIntenta-ho de nou");
                break;
        }
    }
    static void showAllList() {
        for (Fitxa f : llistaFitxes) {
            System.out.println(f);
        }
    }
    static void addNewObra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la referència");
        String referencia = sc.nextLine();
        System.out.println("Introdueix el títol");
        String titol = sc.nextLine();
        System.out.println("Introdueix el nom de l'autor");
        String autor = sc.nextLine();
        short nombrePagines = introduceShort("Introdueix el nombre de pàgines");
        llistaFitxes.add(new Obra(referencia, titol, autor, nombrePagines));
    }
    static void addNewVolum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la referència");
        String referencia = sc.nextLine();
        System.out.println("Introdueix el títol");
        String titol = sc.nextLine();
        System.out.println("Introdueix el nom de l'autor");
        String autor = sc.nextLine();
        short nombrePagines = introduceShort("Introdueix el nombre de pàgines");
        short numeroVolum = introduceShort("Introdueix el número de volum");
        llistaFitxes.add(new Volum(referencia, titol, autor, nombrePagines, numeroVolum));
    }
    static void addNewRevista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la referència");
        String referencia = sc.nextLine();
        System.out.println("Introdueix el títol");
        String titol = sc.nextLine();
        short any = introduceShort("Introdueix l'any");
        short numeroRevista = introduceShort("Introdueix el número de revista");
        llistaFitxes.add(new Revista(referencia, titol, any, numeroRevista));
    }
    static short introduceShort(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        short num = -1;
        try {
            num = sc.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("Error: No és un caràcter vàlid");
            run();
        }
        return num;
    }
    static int introduceInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int num = -1;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: No és un caràcter vàlid");
            run();
        }
        return num;
    }
}