package one.digital.dinnovation.gof.singleton;

/**
 * Singleton preguiçoso
 * Created by calle on 18/10/2023.
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
