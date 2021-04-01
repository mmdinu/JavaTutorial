package Java;

import org.junit.Test;

public class Variabile
{

    // Clasa = un sablon de atribute - pentru a identifica obiectele - si metode
    // Clasa  - lucru considerat obiect - consturire - in interiorul clasei
    // Structura = public cuvantulClass numeleClasei{} ca mai sus
    // Atribut = se mai numeste si varabila,
    // Variabila = de mai multe tipuri - structura = public, tip variabila, nume variabila
    // Variabile = nu exista o limita maxima de variabile

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public double Inaltime;

    // Metode = actiune actiuni pe care le definim intro clasa, actiuni care le face o clasa numele
    // Metode - nu exista o limita maxima de metode
    // Doua tipuri de metode: 1 metode void - acuma ni trebe facut si se face
    //                        2 metode return - va fi facuta in viitor
    // Structura =  public - tip metoda - nume metoda(){}

    // nu poti face run numai cu Junit = framework de testare pe baza caruia putem face metode de test
    // Junit putem face unit teste sau teste automate
    // Junit = @test - adaugam deasupra metodei care vrem sa fie metoda de test

    @Test

    public void Mananca(){
        // Atribuim valori pentru variabilele de mai sus
        Nume = "Mihaila";
        Prenume = "Dinu";
        Varsta = 57;
        Inaltime = 1.86;

        // ca sa adunam soua stringuri = concadenare( se face cu +)

        System.out.print(Nume + " ");
        System.out.println(Prenume + " ");
        System.out.println("varsta mea este de "  + Varsta + " ani");
        System.out.println("inaltimea este de " + Inaltime + " cm");

        System.out.println(" ");

        System.out.println(Nume + " " + Prenume);

        System.out.println(" ");

        System.out.print("inaltimea mea este de: " + Inaltime + " cm");

        System.out.println(" ");
        System.out.println(" ");






    }


}
