import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void whenGivenThreeNumber_ifFirstNumberIsMax_shouldReturnFirstNumber() {
        MaxElement maxElement = new MaxElement();
        int max = maxElement.testMax(9,2,6);
        Assert.assertEquals(9,max);
    }

    @Test
    public void whenGivenThreeInteger_ifSecondNumberIsMax_shouldReturnSecondNumber() {
        MaxElement maxElement = new MaxElement();
        int max = maxElement.testMax(9,12,6);
        Assert.assertEquals(12,max);
    }

    @Test
    public void whenGivenThreeInteger_ifThirdNumberIsMax_shouldReturnThirdNumber() {
        MaxElement maxElement = new MaxElement();
        int max = maxElement.testMax(9,12,16);
        Assert.assertEquals(16,max);
    }
}
