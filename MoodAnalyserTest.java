import org.junit.Assert;
import org.junit.Test;

public class MoodanalyserTest {
    static MoodAnalyser checkMessage = new MoodAnalyser();
    @Test
    public void givenMesaageWhenSadShouldreturnSad() {
        Assert.assertEquals("SAD", checkMessage.analyseMood("This ia a sad message"));
    }
    @Test
    public void givenMessageWhennotSadShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage.analyseMood("This is a normal message"));
    }
}
