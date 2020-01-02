public class MaxElement <E extends  Comparable> {
    E a;
    E b;
    E c;

    public MaxElement(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MaxElement() {
    }

    public <E extends Comparable> E testMax(E a, E b, E c) {
        E maxValue=a;
        if (b.compareTo(maxValue)>0) {
            maxValue = b;
        }
        if (c.compareTo(maxValue)>0) {
            maxValue = c;
        }
        return maxValue;

    }

    public E testMaximum()
    {
        E max = testMax(a,b,c);
        return  max;
    }


}
