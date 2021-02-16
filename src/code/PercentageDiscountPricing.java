package code;

public class PercentageDiscountPricing implements ISalePricing {


    double percentage;

    public PercentageDiscountPricing(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public long getTotal(Sale sale) {
        return 0;
    }
}
