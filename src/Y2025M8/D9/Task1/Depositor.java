package Y2025M8.D9.Task1;

class Depositor extends Thread {
    private BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.deposit(100);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}