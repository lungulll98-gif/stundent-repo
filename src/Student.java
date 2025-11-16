import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti facultatea (Matematica / Informatica): ");
        String facultate = scanner.next();
        System.out.println("A fost aleasa Facultatea " + facultate);

        System.out.print("Doriti sa introduceti studenti noi? (Da/Nu): ");
        String raspuns = scanner.next();
        if (raspuns.equalsIgnoreCase("Nu")){
            System.out.println("Iesire din program...");
            return;
        }

        System.out.print("Introduceti  numele grupei noi: ");
        String numeGrupa = scanner.next();
        System.out.println("Introducerea studentilor grupei "+ numeGrupa);

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        System.out.print("Introduceti numele studentului: " );
        String numeStudent = scanner.next();
        System.out.print("Introduceti anul nasterii studentului: ");
        int anNastere   = scanner.nextInt();

        IntStudent.formaPrezent(numeStudent, anNastere);
    }
}
