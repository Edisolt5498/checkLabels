class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] keywords = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}