package module_3.final_tasks.task1;

public class SpamAnalyzer extends KeywordAnalyzer {
   private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }
}
