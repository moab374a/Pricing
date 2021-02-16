package code;

public class PercentageDiscountPricing implements ISalePricing {


    double percentage;

    public PercentageDiscountPricing(double percentage) {
        Validator.checkPercent(percentage);
        this.percentage = percentage;
    }

    @Override
    public long getTotal(Sale sale) {
        Validator.checkParam(sale);



         long   result  = (long) (percentage * (sale.getPreDiscountTotal() /100.0));

        return sale.getPreDiscountTotal() - result;
    }
}
