package marketstore.paydesk;

import marketstore.cards.Card;

public class PayDesk {
    private static double discountRate(Card card) {
        // In case of purchase without a discount card.
        if (card == null) {
            return 0;
        }

        // In case of purchase with a discount card.
        return card.currentRate();
    }

    private static double discount(double purchaseValue, Card card) {
        return discountRate(card) / 100 * purchaseValue;
    }

    private static double total(double purchaseValue, Card card) {
        return purchaseValue - discount(purchaseValue, card);
    }

    public static Invoice invoice(double purchaseValue, Card card) {
        Invoice invoice = new Invoice(purchaseValue);

        if (card == null) {
            return invoice;
        }

        invoice.setCardType(card.getCardType().toString());
        invoice.setDiscountRate(discountRate(card));
        invoice.setDiscount(discount(purchaseValue, card));
        invoice.setTotal(total(purchaseValue, card));

        return invoice;
    }
}