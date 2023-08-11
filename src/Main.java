package src;

public class Main {
    public static void main(String[] args) {
        SingletonPatternEarly instanceEarly = SingletonPatternEarly.getInstance();
        instanceEarly.show();
        SingletonPatternLazy instanceLazy = SingletonPatternLazy.getInstance();
        instanceLazy.show();
        PrintSpooler spooler = PrintSpooler.getInstance();
    }
}
