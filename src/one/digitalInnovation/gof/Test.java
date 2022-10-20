package one.digitalInnovation.gof;

import one.digitalInnovation.gof.facade.Facade;
import one.digitalInnovation.gof.singleton.SingletonEager;
import one.digitalInnovation.gof.singleton.SingletonLazy;
import one.digitalInnovation.gof.singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.strategy.Comportamento;
import one.digitalInnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalInnovation.gof.strategy.ComportamentoNormal;
import one.digitalInnovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        //    SINGLETON

//        como o construtor deles são pricados temos que acessar pela classe
//        mesmo que chame a classe n+ vezes continuará recebendo o mesmo valor de instancia
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazyHolder lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //    STRATEGY
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        //    FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Finn", "134700000");

    }
}
