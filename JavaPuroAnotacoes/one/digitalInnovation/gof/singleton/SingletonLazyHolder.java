package one.digitalInnovation.gof.singleton;

public class SingletonLazyHolder {

    //    ELE VAI ENCAPSULAR ESSA INSTANCIA EM UMA CLASSE STATIC INTERNA
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
