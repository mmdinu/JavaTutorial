package HomeWork;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PracticeProject_Cerinta {

    // For every lines is declare new variables

    public String Mesaj; // Hello World
    public Integer VarstaMea; // Varsta ta (numar)
    public String Nume; // Numele si prenumele pe 2 randuri / print into two lines
    public String Prenume; // Numele si prenumele pe 2 randuri / print into two lines
    public String Date; // current date, with day/mount/yer,
    public String Our; // our:minutes PM/AM,
    public String Day; // day in Text
    // (Tot) Care ii data de astazi?
    //  1/13/2019
    //  18:30 PM
    //  Marti/Joi
    public int Exercitiul; // Cat face [2+(3*4)-3]/3 ?

    //public String Rezultatul; // Rezultatul corect este: {rezultatul}

    public Integer Suma3NrDuble; // afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj

    public Integer Produsul2Nr; // afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj

    //public String MesajRez; // concateneaza la valoarile rezultate de mai sus mesajul "Stiu ca am calculat bine" si
    // afiseaza-l pe ecran cu tot cu rezultatul calculului

    public String Salut; // Adauga la "Salut"
    // caracterul "M" la final
    public String Caracter;

    public String Hello; // Adauga la "Hello"
    public String Has; // caracterul "H" la inceput

    public String AnaCuMere; //Adauga la "Ana are mere,pere,prune"
    public String Zet; // dupa fiecare vocala de la final caracterul "Z"

    public String TextLaRez; // Adauga la toate rezultatele obtinute:
    // " Poti pleca acasa dupa ce iti verific munca!"

    @Test
    public void ExecutaTema(){

        TextLaRez = "  - Poti pleca acasa dupa ce iti verific munca! ";

        Mesaj = "Hello World";
        System.out.println (Mesaj + TextLaRez);

        VarstaMea = 57;
        System.out.println ("Varsta mea este de " + VarstaMea + " ani" + TextLaRez);

        Nume = "Mihaila";
        Prenume = "Dinu";
        System.out.println ( Nume + TextLaRez);
        System.out.println ( Prenume + TextLaRez);

        Date = "06.04.2021";
        Our = "18:20 PM";
        Day = "Marti";
        System.out.println ( Date + TextLaRez);
        System.out.println ( Our + TextLaRez);
        System.out.println ( Day + TextLaRez);
        // sau:
        LocalDateTime current = LocalDateTime.now ();
        System.out.println ("Data si ora curenta este: " + current);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("Data si ora curenta este: " + formatted);


        Exercitiul = (2+(3*4)-3)/3;
        System.out.println ("Rezultatul simplu integer este: " + Exercitiul + TextLaRez); // obligatoriu in integer! de ce?

        PrintExercitiul ( (2+(3*4)-3)/3.0f);

        PrintA (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))); // un calcul complex! OK!

    }

public void PrintExercitiul(double ValoareExercitiul){

    System.out.println ("Rezultatul corect este: " + ValoareExercitiul + TextLaRez); // in double de ce nu rezulta 3,66666666?

}
public void PrintA(double ValoareA){

    System.out.println ( ValoareA );


        Suma3NrDuble = ( 2 + 4 + 8 );
        System.out.println ( "Suma celor trei numere duble, respectiv 2, 4 si 8 este de: " + Suma3NrDuble + TextLaRez);

        Produsul2Nr = (4 * 8);
        System.out.println ("Produsul celor doua numere, respectiv 4 si 8 este de: " + Produsul2Nr + TextLaRez);

        // Stiu ca am calculat bine!
        System.out.println ("Stiu ca am calculat bine cele doua exercitii! " + Suma3NrDuble +" si "+ Produsul2Nr + TextLaRez);

        Salut = "Salut";
        Caracter = "M";
        System.out.println (Salut + Caracter + TextLaRez);

        Hello = "Hello";
        Has = "H";
        System.out.println (Has + Hello + TextLaRez);



        // vocale: a, e, i, o, u.
        AnaCuMere = "Ana are mere, pere, prune";
        Zet = "Z";
        System.out.println ("Ana" + Zet + " are" + Zet + " mere" + Zet + ", pere" + Zet + ", prune" + Zet + TextLaRez);








}



}



