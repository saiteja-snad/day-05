package Multitread;

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(String user,int amount) {
        System.out.println(user + " trying to withdraw "+ amount);
        if(balance >= amount) {
            System.out.println(user + " processing transaction...");
            try {
                Thread.sleep(2000);

            } catch(Exception e) {
            }

            balance = balance - amount;

            System.out.println(user + " withdrawal successful");
            System.out.println("Remaining Balance: "+ balance);
        }
        else {
            System.out.println( "Insufficient balance for " + user);
        }
    }
}

class UserThread extends Thread {

    BankAccount account;
    String name;
    int amount;

    UserThread(BankAccount account, String name,int amount) {

        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {

        account.withdraw(name, amount);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        UserThread t1 =
                new UserThread(obj,"Sai", 700);
        UserThread t2 =
                new UserThread(obj, "Teja", 500);

        t1.start();
        t2.start();
    }
}
