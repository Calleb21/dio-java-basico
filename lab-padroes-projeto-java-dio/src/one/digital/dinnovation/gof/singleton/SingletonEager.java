package one.digital.dinnovation.gof.singleton;

/**
 * Singleton apressado
 * Created by calle on 18/10/2023.
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
