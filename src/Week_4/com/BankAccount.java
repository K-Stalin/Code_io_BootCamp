package Week_4.com;

abstract class BankAccount {
    abstract  void deposit(int amount);
    abstract  void withdraw(int amount);
    abstract  void getBalance();

}

class  SavingsAccount extends BankAccount {
    int balance;
    int MIN_BALANCE= 500;
    SavingsAccount(int balance)
    {
        this.balance = balance;
    }
    @Override
    void deposit(int amount)
    {
         if(amount <=0)
         {
             System.out.println("Invalid Amount");
         }else {
             balance +=amount;
         }
    }
    @Override
    void  withdraw(int amount)
    {
        if(balance- amount < MIN_BALANCE)
        {
            System.out.println("Account should be needed Min balance: "+MIN_BALANCE);
        }else {
            balance-=amount;
            System.out.println("Amount withdrawed Successfuly!");
        }
    }

    void getBalance()
    {
        System.out.println("Current Balance SavingsAccount: "+ balance);
    }
}


class  CurrentAccount extends BankAccount {
    int balance;

    CurrentAccount(int amount)
    {
        this.balance = amount;
    }


    @Override
    void deposit(int amount)
    {
        if(amount <=0)
        {
            System.out.println("Invalid Amount");
        }else {
            balance +=amount;
        }
    }
    @Override
    void  withdraw(int amount)
    {
        if(balance < amount )
        {
            System.out.println("Not Enough Money Presented");
        }else {
            balance-=amount;
            System.out.println("Amount withdrawed Successfuly!");
        }
    }

    @Override
    void getBalance()
    {
        System.out.println("Current Balance in CurrentAccount: "+ balance);
    }

}


class BankMain{
    public static void main(String[] args) {
         BankAccount bankAccount;

         bankAccount = new SavingsAccount(1000);
         bankAccount.withdraw(600);
         bankAccount.getBalance();

        System.out.println("------------------------------------");

         bankAccount =  new CurrentAccount(10000);
         bankAccount.getBalance();
         bankAccount.deposit(0);
    }
}