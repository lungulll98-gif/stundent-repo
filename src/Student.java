import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti facultatea (Matematica / Informatica): ");
        String alege = scanner.next();

        System.out.print("Doriti sa introduceti studenti noi? (Da/Nu): ");
        String raspuns = scanner.next();
        if (raspuns.equalsIgnoreCase("Nu")){
            System.out.println("Iesire din program...");
            return;
        }
        System.out.print("Creati  numele grupei noi: ");
        String grupa = scanner.next();
        System.out.println("Introducerea studentilor grupei "+ grupa);
    }
}
