/**
 * Butterfly
 */
class Butterfly {

    /**
     * Pattern of the butterfly
     */
    private Pattern pattern;

    /**
     * Color of the butterfly
     */
    private Color color;

    /**
     * Feelers of the butterfly
     */
    private Feelers feelers;

    /**
     * Constructor
     * @param pattern Pattern
     * @param color Color
     * @param feelers Feeler
     */
    Butterfly(Pattern pattern, Color color, Feelers feelers) {
        this.pattern = pattern;
        this.color = color;
        this.feelers = feelers;
    }

    /**
     *
     * @return Pattern
     */
    Pattern getPattern() {
        return pattern;
    }

    /**
     *
     * @return Color
     */
    Color getColor() {
        return color;
    }

    /**
     *
     * @return Feelers
     */
    Feelers getFeelers() {
        return feelers;
    }
}