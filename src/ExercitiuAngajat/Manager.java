package ExercitiuAngajat;

public class Manager extends Angajat{

    String sefDeEchipa = "Tudor";

    //@Override
    void descriereAngajat(String name, String surname, int salariu, String sefDeEchipa) {
        this.sefDeEchipa = sefDeEchipa;
        super.descriereAngajat(name, surname, salariu);
        System.out.println("Sef de echipa " + sefDeEchipa);
        System.out.println("Nume " + name);
        System.out.println("Surname " + surname);
        System.out.println("Salariu " + salariu);



    }

    //    public static void main(String[] args) {
//        Manager manager = new Manager();
//
//        manager.name = "Jora 2";
//        manager.surname = "Jora 2";
//        manager.name = "Jora 2";
//    }



//    public void sefPeEchipa(){
//        System.out.println("Sef pe echipa.");
//    }
//    @Override
//    public void numePrenumeAngajat(){
//        System.out.println("Baris Tekir");
//    }
//    public void numePrenumeAngajat2(){
//        System.out.println("Mihai Pogorenko ");
//    }

}
