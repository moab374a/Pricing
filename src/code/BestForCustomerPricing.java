package code;

import java.util.List;

public class BestForCustomerPricing extends ComplexPricing {


    public BestForCustomerPricing(ISalePricing pricing) {
        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        return 0;
    }


}
