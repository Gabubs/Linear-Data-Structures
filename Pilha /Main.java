public class Main {
    public static void main(String[] args) {

        Rubro teste = new Rubro();
        teste.pushP(1);
        teste.pushP(2);
        teste.pushP(3);
        teste.pushP(4);
        teste.pushP(5);
        teste.pushP(6);
        teste.pushV("A");
        teste.pushV("B");
        teste.pushV("C");

        teste.arrayCheck();

        System.out.println(teste.popP());
        System.out.println(teste.popP());

        System.out.println(teste.popV());
        System.out.println(teste.popV());
        System.out.println(teste.getCapacity());
        System.out.println(teste.popP());
        teste.arrayCheck();
        System.out.println(teste.getSizeV());
        System.out.println(teste.getSizeP());
    }
}
