package code;

import java.util.List;

public class BestForStorePricing extends ComplexPricing{


    public BestForStorePricing(ISalePricing pricing) {
        super(pricing);
    }

    public long getTotal(Sale sale)
    {
        return 0;
    }
}
