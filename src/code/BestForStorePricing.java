package code;

import java.util.List;

public class BestForStorePricing extends ComplexPricing{


    public BestForStorePricing(ISalePricing pricing) {
        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        Validator.checkParam(sale);

        long a = sale.getPreDiscountTotal();

        for (ISalePricing isale: getPricings()) {
            // return after discount
            if ( isale.getTotal(sale) > a){
                a= isale.getTotal(sale);
            }
        }
        return a-500;
    }
}
