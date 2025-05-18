package facade;

public class Main {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.transferMoney("ACC12345", "ACCC54321", 500.0);
    }
}
