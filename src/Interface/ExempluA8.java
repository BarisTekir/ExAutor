package Interface;

class ExempluA8 implements Printable2,Showable{
    @Override
    public void print() {
        System.out.println("Noroc");
    }

    @Override
    public void show() {
        System.out.println("La revedere");
    }

    public static void main(String[] args) {
        ExempluA8 obj = new ExempluA8();
        obj.print();
        obj.show();
    }
}
