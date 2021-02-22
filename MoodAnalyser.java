public class MoodAnalyser {
    public String analyseMood(String message) {
        System.out.println("Welcome to Mood Analyser Program");
	if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
}
