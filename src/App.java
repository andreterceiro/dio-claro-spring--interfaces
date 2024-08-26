public class App {
    public static void main(String[] args) throws Exception {
        Implementadora implementadora = new Implementadora();
        implementadora.metodoDaInterface1();
        implementadora.metodoDaInterface2();

        Interface1 implementadoraInterface1 = new Implementadora();
        implementadoraInterface1.metodoDaInterface1();        
        // A linha abaixo gera um erro de compilação
        //implementadoraInterface1.metodoDaInterface2();

        Interface2 implementadoraInterface2 = new Implementadora();
        implementadoraInterface2.metodoDaInterface2();
        // A linha abaixo gera um erro de compilação
        //implementadoraInterface2.metodoDaInterface1();

        implementadora.metodoDaClassePai(123);

    }
}
