package one.digital.dinnovation.gof.singleton;

/**
 * Description of Test
 * Created by calle on 18/10/2023.
 */
public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design Patterm Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
