package code;


public class AbsoluteDiscountPricing implements ISalePricing {
    private long discount;
    private long threshold;

    public AbsoluteDiscountPricing(long discount, long threshold) {
        Validator.checkParam(discount);
        Validator.checkParam(threshold);
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public long getTotal(Sale sale) {
        Validator.checkParam(sale);

        if (sale.getPreDiscountTotal() - discount > threshold) {
            return   (sale.getPreDiscountTotal() - discount);
        }

        else if (sale.getPreDiscountTotal() >  threshold) {

            return threshold;
        }
        return sale.getPreDiscountTotal();
    }
}
