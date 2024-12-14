package Interface;
//declaram interfata de utilizatorul prim
interface Desenabil {
    void deseneaza();
}
//implementarea de catre al doilea utilizator
class Patrat implements Desenabil {
    public void deseneaza() {
        System.out.println("Desenam Patrat");
    }
}
    class Cerc implements Desenabil {
        public void deseneaza() {
            System.out.println("Desenam Cerc");
        }
    }

    //utilizarea interfetei de catre al 3-lea user
    class Interface {
        public static void main(String[] args) {
            Desenabil d = new Cerc();
            d.deseneaza();

            Desenabil c = new Patrat();
            c.deseneaza();
        }

    }
