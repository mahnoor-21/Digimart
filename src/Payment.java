import java.time.LocalDate;
public class Payment {
    // Attributes

    private static int nextPaymentId = 1;
    protected LocalDate paymentDate ;
    protected double total;
    private int paymentID;
    Payment(){
        paymentID = generateUniqueId();
        paymentDate = LocalDate.now();
        total = 0.0;
    }
    public Payment(Customer user, LocalDate paymentDate) {
        this.paymentID = generateUniqueId();
        this.paymentDate = paymentDate;

    }
    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    // Methods
    public int generateUniqueId() {
        return nextPaymentId++;
    }

}