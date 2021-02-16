package code;

import java.util.List;

public class BestForCustomerPricing extends ComplexPricing {


    public BestForCustomerPricing(ISalePricing pricing) {

        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        Validator.checkParam(sale);
        return 0;
    }


}
