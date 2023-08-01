package Test138;

public class Ehanshi {
    private Ehanshi() {

    }
    private static Ehanshi instance = new Ehanshi();

    public static Ehanshi getInstance() {
        return instance;
    }
}
