package marketstore.main;

import marketstore.cardholders.Cardholder;
import marketstore.cards.BronzeCard;
import marketstore.cards.Card;
import marketstore.cards.GoldCard;
import marketstore.cards.SilverCard;
import marketstore.paydesk.PayDesk;

public class Main {
    private static void printString(String s) {
        System.out.print(s + "\n");
    }

    /* Creating an instances of a cardholder and a discount card,
    /* updating the turnover and printing an exemplary invoice.
     */
    public static void main(String[] args) {
        // Bronze
        Cardholder cardholder = new Cardholder("Sigizmund", "Krzhizhanovsky");
        Card card = new BronzeCard(cardholder);
        printString(PayDesk.invoice(150, card).toString());

        // Silver
        cardholder = new Cardholder("Julio", "Cortazar");
        card = new SilverCard(cardholder);
        card.setTurnover(600);
        printString(PayDesk.invoice(850, card).toString());

        // Gold
        cardholder = new Cardholder("Hermann", "Hesse");
        card = new GoldCard(cardholder);
        card.setTurnover(1500);
        printString(PayDesk.invoice(1300, card).toString());
    }
}