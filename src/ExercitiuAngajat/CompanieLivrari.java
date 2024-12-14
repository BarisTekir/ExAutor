package ExercitiuAngajat;

import java.sql.SQLOutput;

public class CompanieLivrari {
    public static void main(String[] args) {

        Curier curier   = new Curier();
        Manager manager = new Manager();

        System.out.println("CLASA CURIER");
        curier.descriereAngajat("Vasea", "Branza", 6500,"Criuleni");

        System.out.println("\nCLASA MANAGER");
        manager.descriereAngajat("Mihai", "Munteanu", 7800,"Ün pidaraz");


    }

}
