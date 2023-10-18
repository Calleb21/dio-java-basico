package one.digital.dinnovation.gof.strategy;

/**
 * Description of ComportamentoNormal
 * Created by calle on 18/10/2023.
 */
public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
