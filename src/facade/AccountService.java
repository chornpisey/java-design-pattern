package facade;

public class AccountService {
    public boolean verifyAccount(String accountNumber){
        System.out.println("Verify account: " + accountNumber);
        return true; // Assume alway valid.
    }
}
