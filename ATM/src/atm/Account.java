package atm;

/**
 * This represents the most generic account type.
 * @author Jesse
 */
public class Account {
    
    public static final int ACCOUNT_CHECKING = 0;
    public static final int ACCOUNT_SAVINGS = 1;
    
    private String accountNo;
    private double balance;
    private int accountType;
    
    public Account(String accountNo, double balance, int accountType)
    {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    public String getAccountNo() {
        return accountNo;
    } 
    
    public double getBalance()
    {
        return balance;
    }
    
    public int getAccountType()
    {
        return accountType;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public double withdraw(double amount) throws Exception
    {
        if (balance - amount < 0)
            throw new Exception();
        
        balance -= amount;
        
        return balance;
    }
    
    public void transfer(Account actTo, double amount) throws Exception
    {
        withdraw(amount);
        actTo.deposit(amount);
    }
    
    @Override
    public String toString()
    {
        String result = "Account type: ";
        
        switch (accountType)
        {
            case ACCOUNT_CHECKING:
                result += "Checking - Balance:";
                break;
            case ACCOUNT_SAVINGS:
                result += "Savings - Balance:";
                break;  
            default:
                result += "Other - Balance:";
                break;
        }
        return result + String.format("$%.2f", balance);
    }
}
