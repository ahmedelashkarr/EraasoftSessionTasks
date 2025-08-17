package Y2025M8.D9.Task1;

import java.time.Duration;

public class Main {
    public static void main(String[] args){

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        BankAccount account = new BankAccount();

        Depositor depositor = new Depositor(account);
        Withdrawer withdrawer = new Withdrawer(account);

        depositor.start();
        withdrawer.start();


    }
}