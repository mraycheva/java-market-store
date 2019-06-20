package marketstore.paydesk;

import marketstore.cards.Card;

public class PayDesk {
    public static double discountRate(Card card) {
        // In case of purchase without a discount card.
        if (card == null) {
            return 0;
        }

        // In case of purchase with a discount card.
        return card.currentRate();
    }

    public static double discount(double purchaseValue, Card card) {
        return discountRate(card) / 100 * purchaseValue;
    }

    public static double total(double purchaseValue, Card card) {
        return purchaseValue - discount(purchaseValue, card);
    }
}