package src;

public class PrintSpooler {
    private static PrintSpooler spooler;
    
    private static boolean inialized = false;
    
    private PrintSpooler() {
    }
    
    public void init() {
        // code to  initialize our spooler goes here
    }
    
    public static synchronized PrintSpooler getInstance() {
            if (inialized) return spooler;
            spooler = new PrintSpooler();
            spooler.init();
            inialized = true;
            return spooler;
    }
}
