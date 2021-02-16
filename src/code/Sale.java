package code;

public class Sale {

    private long preDiscountTotal;
    ISalePricing pricing;

    public Sale(long preDiscountTotal, ISalePricing pricing) {
        Validator.checkParam(pricing);
        Validator.checkParam(preDiscountTotal);
        this.preDiscountTotal = preDiscountTotal;
        this.pricing = pricing;
    }

    public long getPreDiscountTotal() {
        return preDiscountTotal;
    }

    public void setPricing(ISalePricing pricing) {
        Validator.checkParam(pricing);
        this.pricing = pricing;
    }

    // not finished
    public long getTotal()
    {
        return pricing.getTotal(this);
    }


    public static ISalePricing createPricing(DiscountType discountType , double percentage , long discount , long threshold )

    {
        Validator.checkParam(discountType);
        Validator.checkParam(discount);
        Validator.checkParam(threshold);
        Validator.checkPercent(percentage);
        return null;
    }

}
