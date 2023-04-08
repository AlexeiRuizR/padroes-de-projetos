import com.dio.padroes.de.java.Singleton;
import com.dio.padroes.de.java.SingletonEager;
import com.dio.padroes.de.java.SingletonLazy;

public class Main {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance("DIO");
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance("DIO");
        System.out.println(lazy);

        Singleton security =  new Singleton("DIO");
        System.out.println(security);
        security = Singleton.getInstance("DIO");
        System.out.println(security);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

    }
}