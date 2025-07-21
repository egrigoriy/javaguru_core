package module_3.final_tasks.task1;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
