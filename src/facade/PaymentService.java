package facade;

public class PaymentService {
    public void transfer(String fromAccount, String toAccount, double amount){
        System.out.println("Transferring $" + amount + " from " + fromAccount + " to " + toAccount);
    }
}
