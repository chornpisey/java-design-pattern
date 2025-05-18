package facade;

public class BankFacade {
    private AccountService accountService;
    private PaymentService paymentService;
    private NotificationService notificationService;

    public BankFacade(){
        this.accountService = new AccountService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
    }

    public void transferMoney(String fromAcc, String toAcc, double amount){
        System.out.println("Initiating fund transfer ...");
        if(accountService.verifyAccount(fromAcc) && accountService.verifyAccount(toAcc)){
            paymentService.transfer(fromAcc, toAcc, amount);
            notificationService.notifyCustomer("Transfer $: " + amount + " was successful");
        }else {
            notificationService.notifyCustomer("Transfer failed: Invalid account(s).");
        }
    }
}
