package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String ime;
    private String prezime;
    private int godinaStudija;
    private String identifikacijskiBroj;
    private String kolegiji = "";
    private int stanjeRacuna = 0;
    private int cijenaKolegija = 600;
    private static int id = 1001;


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Unesite ime studenta: ");
        this.ime = in.nextLine();

        System.out.print("Unesite prezime studenta: ");
        this.prezime = in.nextLine();

        System.out.print("1 - Prva godina\n2 - Druga godina\n3 - Treća godina\n4 - Četvrta godina\nUnesite godinu studija: ");
        this.godinaStudija = in.nextInt();

        postaviIdentifikacijskiBroj();

        System.out.println(ime + " " + prezime + " " + godinaStudija + " " + identifikacijskiBroj);
    }


    private void postaviIdentifikacijskiBroj() {

        id++;
        this.identifikacijskiBroj = godinaStudija + "" + id;
    }


    public void upisi() {

        do {
            System.out.print("Unesite kolegij za upis (Q za izlaz): ");
            Scanner in = new Scanner(System.in);
            String kolegij = in.nextLine();
            if (!kolegij.equals("Q")) {
                kolegiji = kolegiji + "  \n  " + kolegij;
                stanjeRacuna = stanjeRacuna + cijenaKolegija;
            } else {
                break;
            }
        } while (1 != 0);

        System.out.println("UPISAN U: " + kolegiji);
    }


    public void prikaziStanjeRacuna() {
        System.out.println("Vaše stanje računa je: €" + stanjeRacuna);
    }


    public void platiSkolarinu() {
        prikaziStanjeRacuna();
        System.out.print("Unesite iznos plaćanja: €");
        Scanner in = new Scanner(System.in);
        int uplata = in.nextInt();
        stanjeRacuna = stanjeRacuna - uplata;
        System.out.println("Hvala vam na uplati od €" + uplata);
        prikaziStanjeRacuna();
    }


    public String toString() {
        return "Ime: " + ime + " " + prezime + "\nGodina studija: " + godinaStudija + "\nIdentifikacijski broj: " + identifikacijskiBroj + "\nUpisani kolegiji:" + kolegiji + "\nStanje računa: €" + stanjeRacuna;
    }
}
