package code;

import java.util.List;

public class BestForCustomerPricing extends ComplexPricing {


    public BestForCustomerPricing(ISalePricing pricing) {
        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        Validator.checkParam(sale);

        long a = sale.getPreDiscountTotal();

        for (ISalePricing isale: getPricings()) {
            // return after discount
           if ( isale.getTotal(sale) < a){
                a= isale.getTotal(sale);
           }
        }
        return a;
    }


}
