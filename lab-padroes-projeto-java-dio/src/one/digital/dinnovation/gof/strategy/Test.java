package one.digital.dinnovation.gof.strategy;

/**
 * Description of Test
 * Created by calle on 18/10/2023.
 */
public class Test {

    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agresivo = new ComportamentoAgresivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agresivo);
        robo.mover();
    }
}
