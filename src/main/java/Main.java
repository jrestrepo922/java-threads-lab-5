public class Main {
    public static void main(String[] args) throws InterruptedException {
        // your code here
        SavingsAccount savingsAccount = new SavingsAccount();

        Thread t1 = new Thread(() -> savingsAccount.deposit(20));
        Thread t2 = new Thread(() -> savingsAccount.deposit(20));
        Thread t7 = new Thread(() -> {
            savingsAccount.withdraw(10);

        });
        t1.start();
        t2.start();
        t7.start();

        t1.join();
        t2.join();
        t7.join();

        System.out.println(savingsAccount.getTotal());

    }
}
