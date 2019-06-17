package marketstore.paydesk;

import java.text.DecimalFormat;

public class Invoice {
    private String cardType;
    private double purchaseValue;
    private double discountRate;
    private double discount;
    private double total;

    Invoice(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");

        return cardType + ":\n"
                + "Purchase value: $" + df.format(purchaseValue) + "\n"
                + "Discount rate: " + df.format(discountRate) + " %" + "\n"
                + "Discount: $" + df.format(discount) + "\n"
                + "Total: $" + df.format(total) + "\n";
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    void setTotal(double total) {
        this.total = total;
    }
}