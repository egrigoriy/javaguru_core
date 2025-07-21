package module_3.final_tasks.task1;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    abstract String[] getKeywords();
    abstract Label getLabel();


    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
