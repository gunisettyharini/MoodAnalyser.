public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
