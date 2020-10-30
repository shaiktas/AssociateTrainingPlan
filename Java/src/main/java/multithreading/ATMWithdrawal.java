package multithreading;

import java.util.concurrent.BlockingQueue;

public class ATMWithdrawal
{

    public static void main(String[]args)
    {
        final Accounts account = new Accounts("Big Bank");
        Card c1 = new Card(account, 1);
        Card c2 = new Card(account, 2);
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

class Accounts
{
    private int balance;
    private String name;

    public Accounts(int balance, String name)
    {
        this.balance = balance;
        this.name = name;
        System.out.println("Starting balance: " + this.balance);
    }

    public Accounts(String name)
    {
        this.name = name;
        this.balance = 150;
        System.out.println("Starting balance: " + this.balance);
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int withdraw(int amount)
    {
        this.balance -= amount;
        if(this.balance < 0)
        {
            this.balance = 0;
        }
        return this.balance;
    }

    public int withdraw()
    {
        return this.withdraw(1);
    }

    public int deposit(int amount)
    {
        this.balance += amount;
        return this.balance;
    }

    public int deposit()
    {
        return this.deposit(1);
    }

}

class Card implements Runnable
{
    private final Accounts account;
    private int id;

    Card(Accounts account, int id)
    {
        this.account = account;
        this.id = id;
    }

    @Override
    public void run()
    {
            while (account.getBalance() != 0) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Card " + id + " Withdrawal, Current Balance: " + this.account.withdraw());
                }
            }
    }
}