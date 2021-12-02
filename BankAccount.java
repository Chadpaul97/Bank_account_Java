public class BankAccount{
    private static int numberOfAccounts = 0;
    private static double totalBalance; 
    private double checkingBalance;
    private double savingBalance;

    public BankAccount(){
        numberOfAccounts++;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    public void deposit(String accountType,double amount){
        if(amount <= 0){
            return;
        }
        if(accountType == "checking"){
            checkingBalance += amount;
            totalBalance += amount;
        }
        if(accountType == "savings"){
            savingBalance += amount;
            totalBalance += amount;
        }
    }

    public void withdraw(String accountType, double amount){
        if(amount <= 0){
            return;
        }
        if(accountType == "checking"){
            if(checkingBalance < amount){
                throw new Error(" You cannot withraw " + amount + "from checking account!");
            }
            checkingBalance -= amount;
            totalBalance -= amount;
        } else if( accountType == "savings"){
            if(savingBalance < amount){
                throw new Error(" You cannot withraw " + amount + "from savings account!");
            }
            savingBalance -= amount;
            totalBalance -= amount;
        }
}
    public static double getTotalBalance(){
        return totalBalance;
    }

}