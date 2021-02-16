package code;

import java.util.Date;
import java.util.Objects;

public class Validator {

    public static void checkParam(Object object){

        Objects.requireNonNull(object);
    }

    public static void checkParam(long parameter){

        if (parameter < 0) throw new IllegalArgumentException();
    }

    public static void checkPercent(double parameter){

        if (parameter < 0 || parameter > 100) throw new IllegalArgumentException();
    }

    //reatePricing(DiscountType discountType , double percentage , long discount , long threshold )


    public static void checkAll(Object object , double percentage , long discount , long threshold)
    {

        Objects.requireNonNull(object);
        if (percentage < 0 || percentage > 100) throw new IllegalArgumentException();
        if (discount < 0) throw new IllegalArgumentException();
        if (threshold < 0) throw new IllegalArgumentException();


    }



}
