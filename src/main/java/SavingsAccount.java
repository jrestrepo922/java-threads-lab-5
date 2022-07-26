public class SavingsAccount {

  private long total = 0;

  public synchronized boolean withdraw(long amount) {
      if(amount <= this.total){
        this.total = this.total - amount;
        return true;
      } else {
        return false;
      }

  }

  public synchronized void deposit(long amount) {
      this.total = this.total + amount;
  }

  public long getTotal() {
      return total;
  }
}