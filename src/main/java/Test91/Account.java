package Test91;

public class Account {
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        if(amt>0) {
            this.balance += amt;
            System.out.println("存入："+amt);
        }
    }
    public void withdraw(double amt){
        if(amt>=0 && amt<=this.balance){
            this.balance-= amt;
            System.out.println("取出："+amt);
        }else {
            System.out.println("余额不足或取款数额有误");
        }

    }
}
