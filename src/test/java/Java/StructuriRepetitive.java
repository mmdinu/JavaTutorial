package Java;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class StructuriRepetitive {

    @Test
    public void TestAutomat(){
        PrintNumere();
        VectorString();
        ListaString();
        ListaStringWhile();


    }

    // printam primele 10 nr
    public void PrintNumere(){

// facem aceasta cerinta cu for
        // cele mai intalnite structuri repetitive este for si while

        for (int index = 0; index<11; index++ ){
            System.out.println(index);
        }
    }

// parcurgem un vector de stringuri cu for si interactionam cu el

    public void VectorString(){

        /*
        declaram un vector=array de stringuri
        un array trebuie sa primeasca la inceput o dimensiune maxima
        daca definim mai multe elemente decat dimensiunea maxima rezulta eroare
        daca vrem sa adaugam mai multe elemente decat dimensiunea maxima => modificam dimensiunea array-ului[]
        */

        String[] ListaNume = new String[4]; // exemplu de reference tip, vector de 3 elemente

        ListaNume[0] = "Diana";
        ListaNume[1] = "Alex";
        ListaNume[2] = "Dorel";
        ListaNume[3] = "Ana";
        for (int index = 0; index<ListaNume.length; index= index+3){
            System.out.println(ListaNume[index]);
        }
    }

// parcurgem o lista de stringuri cu for si interactionam cu el

    public void ListaString(){

// declaram o lista de stringuri
// lista este mult mai ok de folosit daca nu avem o multime fixa de valori

        List<String> ListaNume = new ArrayList<>();
        ListaNume.add("Diana");
        ListaNume.add("Alex");
        ListaNume.add("Dorel");
        ListaNume.add("Ana");

        /*
        o alta metoda pentru for:
        for ( String s : ListaNume ) {
        System.out.println ( s );
        sau    for (int index = 0; index<ListaNume.size(); index++){
        System.out.println(ListaNume.get(index));
        System.out.println ();
        */

        for ( String s : ListaNume ) {
            System.out.println ( s );
            System.out.println ();
        }
    }

// parcurgem o lista de stringuri cu while si interactionam cu el

    public void ListaStringWhile(){

        /*
        declaram o lista de stringuri
        lista este mult mai ok de folosit daca nu avem o multime fixa de valori
        loop = structuri repetitive
        */

        List<String> ListaNume = new ArrayList<>();
        ListaNume.add("Diana");
        ListaNume.add("Alex");
        ListaNume.add("Dorel");
        ListaNume.add("Ana");
        int index = 0;
        while (index<ListaNume.size()){
            System.out.println(ListaNume.get(index));
            index++;
        }
    }

}
