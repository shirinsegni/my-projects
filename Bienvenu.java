import java.util.Scanner;
public class Bienvenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.println("Bienvenue, " + nom + "!");
        scanner.close();
    }
}