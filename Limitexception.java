public class Limitexception extends Exception {
    private double remainingAmount;

    public Limitexception(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }


    public double getRemainingAmount() {


        return remainingAmount;
    }
}
