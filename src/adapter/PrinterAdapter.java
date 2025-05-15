package adapter;

public class PrinterAdapter implements Logger{ // Adapter.
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter){
        this.legacyPrinter = legacyPrinter;
    }


    @Override
    public void log(String message) {
        this.legacyPrinter.print(message); // Delegating to adaptee.
    }
}
