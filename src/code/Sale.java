package code;

public class Sale {

    private long preDiscountTotal;
    private ISalePricing pricing;


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


    public static ISalePricing createPricing(DiscountType discountType , double percentage , long discount , long threshold ){
        Validator.checkAll(discountType , percentage , discount , threshold);

        switch (discountType){

            case ABSOLUTEDISCOUNT:
                return new AbsoluteDiscountPricing(discount,threshold);
            case PERCENTAGEDISCOUNT:
                return new PercentageDiscountPricing(percentage);
        }

        return null;
    }

}
