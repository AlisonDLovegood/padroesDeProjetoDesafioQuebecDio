package one.digitalInnovation.gof;

public class SingletonEager {
//    quando a variavel statica é definida ele ja atribui a instancia, quando a classe for acionada ja estará pronta p ser retornada
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
        return instancia;
    }
}