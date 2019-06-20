package marketstore.main;

import marketstore.cardholders.Cardholder;
import marketstore.cards.BronzeCard;
import marketstore.cards.Card;
import marketstore.cards.GoldCard;
import marketstore.cards.SilverCard;
import marketstore.paydesk.PayDesk;

import java.text.DecimalFormat;

public class Main {
    private static void printInvoice(int purchaseValue, Card card) {
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println(card.getCardType() + ":\n"
                + "Purchase value: $" + df.format(purchaseValue) + "\n"
                + "Discount rate: " + df.format(PayDesk.discountRate(card)) + " %" + "\n"
                + "Discount: $" + df.format(PayDesk.discount(purchaseValue, card)) + "\n"
                + "Total: $" + df.format(PayDesk.total(purchaseValue, card)) + "\n");
    }

    /* Creating an instances of a cardholder and a discount card,
     * updating the turnover and printing an exemplary invoice. */
    public static void main(String[] args) {
        // Bronze
        Cardholder cardholder = new Cardholder("Sigizmund", "Krzhizhanovsky");
        Card card = new BronzeCard(cardholder);
        printInvoice(150, card);

        // Silver
        cardholder = new Cardholder("Julio", "Cortazar");
        card = new SilverCard(cardholder);
        card.setTurnover(600);
        printInvoice(850, card);

        // Gold
        cardholder = new Cardholder("Hermann", "Hesse");
        card = new GoldCard(cardholder);
        card.setTurnover(1500);
        printInvoice(1300, card);
    }
}