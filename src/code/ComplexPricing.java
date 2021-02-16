package code;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexPricing implements ISalePricing {

    private  List<ISalePricing> pricings;

    public ComplexPricing(ISalePricing pricing) {

        this.pricings = new ArrayList<>();
        pricings.add(pricing);


    }

    public void add(ISalePricing pricing)
    {
        pricings.add(pricing);

    }

    public List<ISalePricing> getPricings() {
        return pricings;
    }
}
