package module_3.final_tasks.task1;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
