package core.patterns;

public class Demo {
    public static void main(String[] args) {
        Singletone sg = null;
        sg = Singletone.getSingletone();

        sg.printMessage();
    }
}
