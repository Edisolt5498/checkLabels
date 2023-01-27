class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}