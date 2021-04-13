package Java;

import org.junit.Test;

public class TelefonTest {

    @Test
    public void TestAutomat(){

        /*
         vom declara mai multe obiecte de tipul Telefon (Telefon=numele clasei)
         obiect = instanta unei clase
         structura obiect = tipClasa NumeObiect=new tipClasa();
         daca facem un obiect care face referire la un construtor cu parametri => specific valorile
         parametrilor in ()
         putem declara n obiecte
        */

        Telefon Iphone = new Telefon("Iphone", "12", "IOS", "20pixeli");
        Iphone.PrintMarca();
        Iphone.PrintModel();

        Telefon Samsung = new Telefon("Samsung", "J15", "Android","24pixeli");
        Samsung.PrintMarca();
        Samsung.PrintModel();
        Samsung.PrintSistemOperare();



    }
}
