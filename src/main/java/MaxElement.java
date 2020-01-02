public class MaxElement {


    public <E extends Comparable> E testMax(E a,E b, E c) {
        E maxValue=a;
        if (b.compareTo(maxValue)>0) {
            maxValue = b;
        }
        if (c.compareTo(maxValue)>0) {
            maxValue = c;
        }
        return maxValue;
    }

}
