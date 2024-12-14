package ExercitiuAngajat;

public class Curier extends Angajat{

    String zonaDeLivrare = "Botanica";

    //@Override
    void descriereAngajat(String name, String surname, int salariu, String zonaDeLivrare) {
        this.zonaDeLivrare = zonaDeLivrare;

        System.out.println("Nume " + name);
        System.out.println("Surname " + surname);
        System.out.println("Salariu " + salariu);
        System.out.println("Zona de livrare " + zonaDeLivrare);

        super.descriereAngajat(name, surname, salariu);
    }


    //    public void zonaDeLivrare(){
//        System.out.println("Zona de livrare");
//    }
}
