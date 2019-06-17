package marketstore.cards;

import marketstore.cardholders.Cardholder;

public class SilverCard extends Card {
    public SilverCard(Cardholder cardholder) {
        super(CardType.SILVER, cardholder, 2);
    }

    @Override
    public double currentRate() {
        if (getTurnover() <= 300) {
            return getInitialRate();
        } else {
            return 3.5;
        }
    }
}