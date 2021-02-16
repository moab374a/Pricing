package code;

import java.util.List;

public class BestForStorePricing extends ComplexPricing{


    public BestForStorePricing(ISalePricing pricing) {
        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        Validator.checkParam(sale);
        return 0;
    }
}
