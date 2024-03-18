import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdyueix el nom");
        String name = sc.nextLine();
        System.out.println("Introdueix el cognom");
        String surname = sc.nextLine();
        int age = 0;
        try {
            age = introduceAge();
        } catch (Exception e) {
            System.out.println("Error: l'edat ha de ser major que 0");
            System.exit(0);
        }
        String dni = null;
        try {
            dni = introduceDNI();
        } catch (Exception e) {
            System.out.println("Error: No és un DNI vàlid");
            System.exit(0);
        }
        String sexe = null;
        try {
            sexe = introduceSexe();
        } catch (Exception e) {
            System.out.println("Error: El sexe ha de ser 'home' o 'dona'");
            System.exit(0);
        }
        System.out.println(name + " " + surname + " " + age + " " + dni + " " + sexe);
    }
    static int introduceAge() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'edat");
        int age = 0;
        try {
            age = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: No és un caràcter vàlid");
        }
        if (age <= 0) {
            throw new Exception();
        } else return age;
    }
    static String introduceDNI() throws Exception {
        Scanner sc = new Scanner(System.in);
        String regex = "\\d{8}[A-HJ-NP-TV-Z]";
        System.out.println("Introdueix el DNI");
        String dni = sc.nextLine();
        Matcher matcher = Pattern.compile(regex).matcher(dni);
        if (!matcher.matches()) {
            throw new Exception();
        } else return dni;
    }
    static String introduceSexe() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el sexe 'home' 'dona'");
        String sexe = sc.nextLine();
        if (!sexe.equals("home") && !sexe.equals("dona")) {
            throw new Exception();
        } else return sexe;
    }
}
