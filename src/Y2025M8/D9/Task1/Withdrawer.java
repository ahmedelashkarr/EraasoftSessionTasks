package Y2025M8.D9.Task1;

class Withdrawer extends Thread {
    private BankAccount account;

    public Withdrawer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.withdraw(100);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}