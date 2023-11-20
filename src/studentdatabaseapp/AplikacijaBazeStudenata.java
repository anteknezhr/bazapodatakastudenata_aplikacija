package studentdatabaseapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AplikacijaBazeStudenata {

    public static void main(String[] args) {
        int brojStudenata = 0;

        while (true) {
            try {

                System.out.print("Unesite broj novih studenata za upis: ");
                Scanner in = new Scanner(System.in);
                brojStudenata = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Pogrešan unos. Molimo unesite cijeli broj.");
            }
        }

        Student[] studenti = new Student[brojStudenata];

        for (int n = 0; n < brojStudenata; n++) {
            studenti[n] = new Student();
            studenti[n].upisi();
            studenti[n].platiSkolarinu();
            System.out.println(studenti[n].toString());
        }
    }
}
