public class BankAccount {
    private double amount;
    double sum;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum){
       this.sum = sum;
        return sum;
    }

    public void withdraw () throws Limitexception{
        setSum(getSum() - getAmount());

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSum() {
        return sum;
    }

    public double setSum(double sum) {
        this.sum = sum;
        return sum;
    }
}
