public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String a : getKeywords()) {
            if (text.contains(a)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}