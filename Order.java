public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode paymentmode;

    public Order(String item, int quantity, double unitPrice, double totalAmount, PaymentMode paymentmode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentmode = paymentmode;
    }

    public Order(){

    }

    public String getItem() {
        return item;
    }


    public void setItem(String item) {
        this.item = item;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getUnitPrice() {
        return unitPrice;
    }


    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public double getTotalAmount() {
        return totalAmount = totalAmount - (totalAmount * paymentmode.determineDiscountRate());
    }


    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    public PaymentMode getPaymentmode() {
        return paymentmode;
    }


    public void setPaymentmode(PaymentMode paymentmode) {
        this.paymentmode = paymentmode;
    }
}
 