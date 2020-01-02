import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxElement <E extends  Comparable> {

    public <E extends Comparable> E testMax(E ...values) {
        E val[]=values;
        Arrays.sort(val);
        System.out.println("maximum value is"+val[val.length-1]);
        return val[val.length-1];
    }

    public E testMaximum(E a, E b ,E c)
    {
        E max = testMax(a,b,c);
        return  max;
    }

}
