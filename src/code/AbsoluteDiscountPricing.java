package code;


public class AbsoluteDiscountPricing implements ISalePricing {
    private long discount;
    private long threshold;

    public AbsoluteDiscountPricing(long discount, long threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public long getTotal(Sale sale) {
        return 0;
    }
}
