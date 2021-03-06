import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void whenGivenMultipleNumber_shouldReturnMaxNumber() {
        MaxElement maxElement = new MaxElement();
        int max = (int) maxElement.testMax(9,2,6,13);
        Assert.assertEquals(13,max);
    }

    @Test
    public void whenGivenThreeNumber_ifFirstNumberIsMax_shouldReturnFirstNumber() {
        MaxElement maxElement = new MaxElement();
        int max = (int) maxElement.testMax(9,2,6);
        Assert.assertEquals(9,max);
    }

    @Test
    public void whenGivenThreeInteger_ifSecondNumberIsMax_shouldReturnSecondNumber() {
        MaxElement maxElement = new MaxElement();
        int max = (int) maxElement.testMax(9,12,6);
        Assert.assertEquals(12,max);
    }

    @Test
    public void whenGivenThreeInteger_ifThirdNumberIsMax_shouldReturnThirdNumber() {
        MaxElement maxElement = new MaxElement();
        int max = (int) maxElement.testMaximum(9,12,16);
        Assert.assertEquals(16,max);
    }

    @Test
    public void whenGivenThreeDoubleNumbers_ifFirstNumberIsMax_shouldReturnFirstNumber() {
        MaxElement maxElement = new MaxElement();
        float max = (float) maxElement.testMax(9.1f,2.1f,6.1f);
        Assert.assertEquals(9.1f,max,0.0);
    }

    @Test
    public void whenGivenThreeDoubleNumbers_ifSecondNumberIsMax_shouldReturnSecondNumber() {
        MaxElement maxElement = new MaxElement();
        float max = (float) maxElement.testMax(9.1f,12.1f,6.1f);
        Assert.assertEquals(12.1f,max,0.0);
    }

    @Test
    public void whenGivenThreeDoubleNumbers_ifThirdNumberIsMax_shouldReturnThirdNumber() {
        MaxElement maxElement = new MaxElement();
        float max = (float) maxElement.testMax(9.1f,12.1f,16.1f);
        Assert.assertEquals(16.1f,max,0.0);
    }

    @Test
    public void whenGivenThreeStringValues_ifFirstValueIsMax_shouldReturnFirstNumber() {
        MaxElement maxElement = new MaxElement();
        String max = (String) maxElement.testMax("Peach","Apple","Banana");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void whenGivenThreeStringValues_ifSecondValueIsMax_shouldReturnSecondValue() {
        MaxElement maxElement = new MaxElement();
        String max = (String) maxElement.testMax("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void whenGivenThreeStringValues_ifThirdValueIsMax_shouldReturnThirdValue() {
        MaxElement maxElement = new MaxElement();
        String max = (String) maxElement.testMax("Banana","Apple","Peach");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void whenGivenThreeInputFromConstructor_shouldReturnMax_() {
        MaxElement maxElement = new MaxElement();
        float max = (float) maxElement.testMax(9.1f,2.1f,6.1f);
        Assert.assertEquals(9.1f,max,0.0);
    }
}
