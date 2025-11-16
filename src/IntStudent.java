import java.util.Scanner;

public class IntStudent {

    public static void formaPrezent(String nume, int an) {

        Scanner scanAn = new Scanner(System.in);

        while(an >= 2018){
                System.out.println("--------------------------------------");
                System.out.println("Nu poate exista student cu asa virsta!");
                System.out.print("Introduceti anul nasterei corect al studentului: ");
                an = scanAn.nextInt();
            }

        int virsta = 2025 - an;
        System.out.println("Student: " + nume + ", Virsta: " + virsta + " ani.");
    }
}
