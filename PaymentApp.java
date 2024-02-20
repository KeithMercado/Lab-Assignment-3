public class PaymentApp {
    public static  void main(String[] args) {
        Order gcash = new Order("keyboard", 10, 300.0, 3000.0, new GCash());

        System.out.println("\nOrder item is " + gcash.getItem());
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity());
        System.out.println("\nPayment order details if " + gcash.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount rate is " + gcash.getPaymentmode().determineDiscountRate());
        System.out.println("Payment amount is " + gcash.getTotalAmount());

        Order maya = new Order();
        maya.setUnitPrice(300.0);
        maya.setTotalAmount(3000.0);
        maya.setPaymentmode(new Maya());

        System.out.println("\nPayment order details if " + maya.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount rate is " + maya.getPaymentmode().determineDiscountRate());
        System.out.println("Payment amount is " + maya.getTotalAmount());

        Order shopeepay = new Order("keyboard", 10, 300.0, 3000.0, new ShopeePay());
        System.out.println("\nPayment order details if " + shopeepay.getPaymentmode().getClass().getSimpleName());
        System.out.println("Discount rate is " + shopeepay.getPaymentmode().determineDiscountRate());
        System.out.println("Payment amount is "+ shopeepay.getTotalAmount());

    }
}