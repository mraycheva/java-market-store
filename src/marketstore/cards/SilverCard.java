package marketstore.cards;

import marketstore.cardholders.Cardholder;

/* Initial discount rate: 2 %.
 * Rate in case of turnover over $300: 3.5 %. */
public class SilverCard extends Card {
    public SilverCard(Cardholder cardholder) {
        super(CardType.SILVER, cardholder, 2);
    }

    @Override
    public double currentRate() {
        if (getTurnover() <= 300) {
            return getInitialRate();
        }

        return 3.5;
    }
}