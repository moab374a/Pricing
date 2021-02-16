package code;

public class Sale {

    private long preDiscountTotal;
    ISalePricing pricing;

    public Sale(long preDiscountTotal, ISalePricing pricing) {
        this.preDiscountTotal = preDiscountTotal;
        this.pricing = pricing;
    }

    public long getPreDiscountTotal() {
        return preDiscountTotal;
    }

    public void setPricing(ISalePricing pricing) {
        this.pricing = pricing;
    }

    // not finished
    public long getTotal()
    {
        return pricing.getTotal(this);
    }


    public static ISalePricing createPricing(DiscountType discountType , double percentage , long discount , long threshold )
    {
        return null;
    }

}
