package Week_3.com;

public class BankAccount {
    int balance;

    BankAccount()
    {
        this.balance =0;
    }
    BankAccount(int initializeBalance)
    {
         this.balance = initializeBalance;
    }

    void deposit(int amount)
    {
        if(amount <=0)
        {
            System.out.println("Please Enter valid amount");
        }else
        {
            this.balance+=amount;
            System.out.println("Amount deposited Successfully!");
        }
    }
    void  withdraw(int amount)
    {
        if(amount<=0)
        {
            System.out.println("Please Enter valid amount");
        }
        else if(this.balance >=amount)
        {
            this.balance-=amount;
            System.out.println("Amount withdraw Successfully!");
        }else {
            System.out.println("You Should not have enough money");
        }
    }
    void  printBalance()
    {
        System.out.println("Currently available Balance: "+this.balance);
    }
}
