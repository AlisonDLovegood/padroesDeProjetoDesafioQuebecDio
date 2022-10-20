package one.digitalInnovation.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;
//    com o construtor sendo privado ninguem consegue instanciar externamente
    private SingletonLazy(){
        super();
    }
//    metodo p expor de maneira publica
    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
