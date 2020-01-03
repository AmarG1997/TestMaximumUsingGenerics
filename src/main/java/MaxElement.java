import java.util.Arrays;

public class MaxElement <E extends  Comparable> {

    public <E extends Comparable> E testMax(E ...values) {
        Arrays.sort(values);
        System.out.println("maximum value is"+values[values.length-1]);
        return values[values.length-1];
    }

    public E testMaximum(E a, E b ,E c)
    {
        E max = testMax(a,b,c);
        printMax(max);
        return  max;
    }

    public void printMax(E max)
    {
        System.out.println("maximum value is"+max);
    }



}
