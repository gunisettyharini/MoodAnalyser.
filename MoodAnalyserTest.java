import org.junit.Assert;
import org.junit.Test;

public class MoodanalyserTest {
    static MoodAnalyser checkMessage = new MoodAnalyser(null);
    @Test
    public void givenNullmoodShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage.analyseMood());
    }
}
