public class Implementadora extends Pai implements Interface1, Interface2 {
    public void metodoDaInterface1(int i) {
        System.out.println("Modo da interface 1");
    }

    public void metodoDaInterface2() {
        System.out.println("Modo da interface 2");
    }

    /*
    public void metodoDaClassePai(String i) {
        System.out.println("Método da classe pai implementado na classe Implementadora" + i);
    }
    */
}
