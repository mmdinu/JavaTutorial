package Java;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class Cursant {

    // Variabilele sunt de mai multe tipuri:
    // globale( la nivel de clasa) si locale(la nivel de metoda)

    public String nume = "Mihaila";
    public String prenume = "Dinu";
    public int varsta;

    @Test
    //Metoda de test(test automat)

    public void TestAutomat(){
        //Apelam metoda PrintInformatii()
        // Metoda - intre {}

        PrintInformatii();
        PrintNume();
        PrintPrenume();
        PrintVarsta(57, "Mihaila");
        PrintVarsta(30, "Alex");
        PrintVarsta(40, "Albert");
        PrintInaltime(1.83);
        PrintInaltime(1.84);
        PrintInaltime(1.70);

    }
    // Facem o metoda prin care printam informatiile despre un cursant

    public void PrintInformatii(){

        System.out.println("numele este " + nume);
        System.out.println("prenumele este " + prenume);

    }

    public void PrintNume(){

        System.out.println(" ");
        System.out.println("numele este " + nume);
    }

    public void PrintPrenume(){

        System.out.println(" ");
        System.out.println("prenumele actual este " + prenume);
        prenume = "Alex";
        System.out.println("noul prenumele este " + prenume);
        System.out.println(" ");
    }

    public void  PrintVarsta(int ValoareVarsta, String ValoareNume ){

        // Metodele pot sau nu sa contina parametri.
        // Putem avea unul sau mai multi parametri
        // Parametri trebuie sa se diferentieze prin tip sau nume
        // Parametri se declara in interiorul parantezelor

        varsta = ValoareVarsta;
        nume = ValoareNume;

        System.out.println ();
        System.out.println( "varsta lui " + nume + " este de " + varsta + " ani");


    }


    public void  PrintInaltime(double ValoareInaltime){


        double VariabilaLocala = ValoareInaltime;

        System.out.println ();
        System.out.println( "inaltimea este de " + VariabilaLocala + " cm");
    }






}
