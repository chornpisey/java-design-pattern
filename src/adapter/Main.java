package adapter;

public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Logger logger = new PrinterAdapter(legacyPrinter);
        logger.log("Hello, Adapter pattern!");
    }
}
