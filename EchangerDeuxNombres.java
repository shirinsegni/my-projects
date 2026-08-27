import java.util.Scanner;
public class EchangerDeuxNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre : ");
        int b = scanner.nextInt();

        // Échange des valeurs
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après l'échange :");
        System.out.println("Premier nombre : " + a);
        System.out.println("Deuxième nombre : " + b);
    }
}