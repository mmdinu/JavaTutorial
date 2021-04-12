package HomeWork;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VariablesWorkDiana {

    public Integer Varsta;
    public String Nume;
    public String Prenume;

    public String Data;
    public String Ora;
    public String Ziua;

    public Float Rezultat;

    public Double Suma;

    public Integer Produs;


    @Test // metoda de test
    public void TestAutomat1() {

        // 1. apelam metoda PrintMesaj()
        PrintMesaj();

        // 2. apelam metoda PrintVarstaNumePrenume()
        PrintVarstaNumePrenume(27, "Terhes", "Diana");
        PrintVarstaNumePrenume(54, "Pop", "Vasile");
        PrintVarstaNumePrenume(32, "Crisan", "Lia");

        // 3. apelam metoda DataOraZiua()
        PrintDataOraZiua("1/13/2019 ", "18:30 PM ", "Marti/Joi");
        PrintDataOraZiua("1/13/2019 ", "18:30 PM ", "Marti");
        PrintDataOraZiua("1/13/2019 ", "18:30 PM ", "Joi");

        // 4. apelam metoda Rezultat()
        PrintRezultat();

        // 5. apelam metoda Suma3NrDouble()
        PrintSuma3NrDouble(1.56, 2.45, 4.89);
        PrintSuma3NrDouble(0.45, -4.5, 7.8);
        PrintSuma3NrDouble(-0.0587, -4.15, -2.5);
        PrintSuma3NrDouble(-0.0, -0.0, -0.0);

        // 6. apelam metoda Produs2NrInteger()
        PrintProdus2NrInteger(4, 5);
        PrintProdus2NrInteger(0, 5);
        PrintProdus2NrInteger(-75, 50);
        PrintProdus2NrInteger(-2, -9);
        PrintProdus2NrInteger(11234569, 1);

        // 10. apelam metoda PrintMesaj1()
        PrintMesaj1();


    }

    // 1. afiseaza mesajul "Hello World"
    public void PrintMesaj() {
        System.out.println(" Hello World ");
        System.out.println(" Hello World " + " M "); // 8
        System.out.println(" H " + " Hello World "); //9
        System.out.println(" Hello World ; " + " Poti pleca acasa dupa ce iti verific munca! "); //13

    }

    // 2. afiseaza varsta + nume si prenume pe 2 randuri
    public void PrintVarstaNumePrenume(Integer ValoareVarsta, String ContinutNume, String ContinutPrenume) {
        Varsta = ValoareVarsta;
        Nume = ContinutNume;
        Prenume = ContinutPrenume;

        System.out.println(" Varsta mea este de " + Varsta + " ani ");
        System.out.println(" Numele meu este " + Nume);
        System.out.println(" Prenumele meu este " + Prenume);

        System.out.println(" Poti pleca acasa dupa ce iti verific munca! ");// 13
    }

    // 3. afiseaza Care ii data de astazi ?
    public void PrintDataOraZiua(String DataDorita, String OraDorita, String ZiuaDorita) {
        Data = DataDorita;
        Ora = OraDorita;
        Ziua = ZiuaDorita;



         System.out.println(" Care ii data de astazi? ");
         System.out.println(" Data este " + Data);
         System.out.println(" Ora este " + Ora);
         System.out.println(" Ne aflam in ziua de " + Ziua);



        System.out.println(" Care ii data de astazi? " + Data + Ora + Ziua);
        System.out.println(" Poti pleca acasa dupa ce iti verific munca! "); // 13
    }

    // 4. afiseaza rezultatul unei operatii
    public void PrintRezultat() {
        Rezultat = (2 + (3 * 4) - 3) / 3.0f;
        // Float Rezultat = (2+(3*4)-3)/3.0f;
        System.out.println(" Rezultatul corect este: " + Rezultat);
        System.out.println(" Stiu ca am calculat bine si rezultatul corect este: " + Rezultat); // 7
        System.out.println(" Poti pleca acasa dupa ce iti verific munca! "); // 13
    }

    // 5. afiseaza pe ecran suma a 3 numere double intr-o variabila de acelasi tip +mesaj
    public void PrintSuma3NrDouble(Double a, Double b, Double c) {
        //Double Suma = a+b+c;
        Suma = a + b + c;
        System.out.println(" Suma celor 3 numere de tip double este: " + Suma);
        System.out.println(" Stiu ca am calculat bine si suma este: " + Suma); // 7
        System.out.println(" Poti pleca acasa dupa ce iti verific munca! "); // 13
    }

    // 6. afiseaza pe ecran produsu a 2 numere integer intr-o variabila de acelasi tip+mesaj
    public void PrintProdus2NrInteger(Integer x, Integer y) {
        Produs = x * y;

        System.out.println(" Produsul celor 2 numere intregi este: " + Produs);
        System.out.println(" Stiu ca am calculat bine si produsul este: " + Produs); // 7
        System.out.println(" Poti pleca acasa dupa ce iti verific munca! "); // 13
    }

    // 10. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
    public void PrintMesaj1() {
        System.out.println(" Ana are mere,pere,prune ");
        System.out.println(" AnaZ areZ mereZ,pereZ,pruneZ ");
        System.out.println(" Ana " + "Z" + " are " + "Z" + " mere " + "Z," + " pere " + "Z," + " prune " + "Z");
        System.out.println(" Poti pleca acasa dupa ce iti verific munca! "); // 13
    }



    public static class Main {
        public static void main(String[] args) {
            //Initializing the date formatter
            DateFormat Date = DateFormat.getDateInstance();
            //Initializing Calender Object
            Calendar cals = Calendar.getInstance();
            //Displaying the actual date
            System.out.println("The original Date: " + cals.getTime());
            //Using format() method for conversion
            String currentDate = Date.format(cals.getTime());
            System.out.println("Formatted Date: " + currentDate);
        }
    }


    public static void main(String[] args) {
            Date date = new Date();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
            String stringDate= DateFor.format(date);
            System.out.println(stringDate);
    }
}
