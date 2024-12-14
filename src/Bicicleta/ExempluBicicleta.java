package Bicicleta;

abstract class ExempluBicicleta {
    ExempluBicicleta() {
        System.out.println("Bicicleta este creata!");
    }
    abstract void run();
    void schimbaViteza() {
        System.out.println("Viteza schimbata!");
    }

    //clasa copil care mosteneste clasa abstracta

}
class Honda extends ExempluBicicleta{
    void run(){
        System.out.println("Merge in siguranta!");
    }
}