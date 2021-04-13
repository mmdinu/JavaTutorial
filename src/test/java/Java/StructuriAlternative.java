package Java;

import org.junit.Test;

public class StructuriAlternative {

    @Test
    public void TestAutomat(){

        VerificaNrMaiMareCa5(6);
        VerificaNrMaiMareCa5(4);
        VerificaNrMaiMareCa5(5);

    }

// Verificam daca un numar este mai mare ca 5
    public void VerificaNrMaiMareCa5(int numar){

//If (conditie1, conditie2, ...) then ...
        //                       else ...

        if (numar == 5) {
            System.out.println("Numarul " + numar + " este egal cu 5");
        }
        if (numar > 5) {
            System.out.println("Numarul " + numar + " este mai mare ca 5");
        }
        if (numar < 5) {
            System.out.println("Numarul " + numar + " este mai mic decat 5");
        }

    }
// verificam daca o propozitie contine un amnumit cuvant
    


}
