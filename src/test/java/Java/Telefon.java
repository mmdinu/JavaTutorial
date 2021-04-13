package Java;

public class Telefon {

// definim variabile generale pentru clasa Telefon

    public String Marca;
    public String Model;
    public String SistemOperare;
    public String Camera;

    /*
    definim un constructor
    constructor = are ca rol sa initializeze atributele unei clase
    structura constructor = public NumeClasa(){}
    intr-o clasa poti sa ai mai multi constructori=> diferentierea lor se face pe baza de parametri
     ! 2 tipuri de constructori: cu parametri si fara parametri
    daca nu avem nici un constructor declarat => este unul ascuns care nu are parametri
    */

    public Telefon(String Marca,String Model,String SistemOperare,String Camera){
// this = keyword care indica o componenta (atribut sau metoda) din interiorul clasei
        this.Marca = Marca;
        this.Model = Model;
        this.SistemOperare = SistemOperare;
        this.Camera = Camera;

    }

    public void PrintMarca(){

        System.out.println(Marca);
    }
    public void PrintModel(){

        System.out.println(Model);
    }

    public void PrintSistemOperare(){

        System.out.println(SistemOperare);

    }

}
