public class BankAccountTest{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.deposit("checking", 15.50);
        account1.deposit("savings",105.20);
        account1.withdraw("checking", 5.20);
        account1.withdraw("savings",15.90);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());
        System.out.println(BankAccount.getTotalBalance());
    }
}