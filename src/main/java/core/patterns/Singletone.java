package core.patterns;

public class Singletone {
    private Singletone() {}

    private static Singletone singletone;

    public static Singletone getSingletone() {

        if (singletone == null) {
            singletone = new Singletone();
        }
        return singletone;
    }

    public void printMessage() {
        System.out.println("Ahahahaha");
    }
}
