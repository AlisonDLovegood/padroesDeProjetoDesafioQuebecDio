package one.digitalInnovation.gof;

public class Test {
    public static void main(String[] args) {
//        como o construtor deles são pricados temos que acessar pela classe
//        mesmo que chame a classe n+ vezes continuará recebendo o mesmo valor de instancia
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazyHolder lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

    }
}
