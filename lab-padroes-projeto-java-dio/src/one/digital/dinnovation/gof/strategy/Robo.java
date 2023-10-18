package one.digital.dinnovation.gof.strategy;

/**
 * Description of Robo
 * Created by calle on 18/10/2023.
 */
public class Robo {

    private Comportamento comportamento;

    public void setStrategy(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
