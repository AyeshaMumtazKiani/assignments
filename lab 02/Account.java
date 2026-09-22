class Account {
    double balance;

    Account() {
        balance = 0;
    }

    Account(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }
}

class Runner {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account(1000);

        a1.deposit(500);
        a2.withdraw(200);

        System.out.println("Account 1 balance: " + a1.balance);
        System.out.println("Account 2 balance: " + a2.balance);
    }
}
