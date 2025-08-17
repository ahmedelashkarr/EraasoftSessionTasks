package Y2025M8.D9.Task1;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Balance: " + balance);
        notify();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " waiting to withdraw " + amount + " (Current Balance: " + balance + ")");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Balance: " + balance);
    }
}







