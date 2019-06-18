package marketstore.cards;

import marketstore.cardholders.Cardholder;

/* Initial discount rate: 0 %.
 * Rate in case of turnover between $100 and $300: 1 %.
 * Rate in case of turnover over $300: 2.5 %. */
public class BronzeCard extends Card {
    public BronzeCard(Cardholder cardHolder) {
        super(CardType.BRONZE, cardHolder, 0);
    }

    @Override
    public double currentRate() {
        if (getTurnover() < 100) {
            return getInitialRate();
        }

        if (getTurnover() <= 300) {
            return 1;
        }

        return 2.5;
    }
}