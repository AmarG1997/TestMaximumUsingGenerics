public class MaxElement {


    public Integer testMax(Integer a, Integer b, Integer c) {
        Integer maxValue=a;
        if (b.compareTo(maxValue)>0) {
            maxValue = b;
        }
        if (c.compareTo(maxValue)>0) {
            maxValue = c;
        }

        return maxValue;
    }

    public Float testFloatMax( Float a, Float b, Float c) {
        float maxValue=a;
        if (b.compareTo(maxValue)>0) {
            maxValue = b;
        }
        if (c.compareTo(maxValue)>0) {
            maxValue = c;
        }

        return maxValue;
    }
}
