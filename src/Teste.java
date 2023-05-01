import dio.desafio.gof.SingletonEager;
import dio.desafio.gof.SingletonLazy;
import dio.desafio.gof.SingletonLazyHolder;
import dio.facade.Facade;
import dio.strategy.Comportamento;
import dio.strategy.ComportamentoAgressivo;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.Robo;

public class Teste {

    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder= SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Comportamento

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("João","37540000");



    }
}
