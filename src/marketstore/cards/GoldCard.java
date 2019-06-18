package marketstore.cards;

import marketstore.cardholders.Cardholder;

public class GoldCard extends Card {
    public GoldCard(Cardholder cardHolder) {
        super(CardType.GOLD, cardHolder, 2);
    }

    // For each $100 from the turnover discount rate grows with 2.5 %, capping at 10 %.
    @Override
    public double currentRate() {
        // In case of turnover below $100, no calculations are needed and initial rate is returned.
        if (getTurnover() < 100) {
            return getInitialRate();
        }

        // In case of turnover of at least $100, current rate is calculated.

        double rateOfGrowth = 2.5;
        double amountOfGrowth = 100;
        int maxRate = 10;

        /* Additional rate is calculated by multiplying the rate of growth
         * by the number of times it needs to be added to the initial rate.
         *
         * The number of times the rate needs to be increased is calculated by dividing turnover
         * by amount of growth and then casting the result to integer in order for it to round up
         * to the lower value, for additional rate is being added only once every $100 are spent
         * (not a penny less). */
        double additionalRate = rateOfGrowth * (int) (getTurnover() / amountOfGrowth);
        double currentRate = getInitialRate() + additionalRate;

        /* After the calculation, if the current rate exceeds the maximum allowed rate,
         * it is being set to the maximum allowed rate. */
        if (currentRate > maxRate) {
            return maxRate;
        }

        return currentRate;
    }
}