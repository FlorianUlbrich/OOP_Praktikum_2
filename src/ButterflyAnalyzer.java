import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets a list of butterflies and counts the occurring attributes.
 */
class ButterflyAnalyzer {

    /**
     * List of butterflies children.
     */
    private ArrayList<Butterfly> butterflies;

    /**
     * List of patterns and how often they occur.
     */
    private Map<String, Integer> result;

    /**
     * Constructor
     * @param butterflies Is the constructor of the Analyzer class.
     */
    ButterflyAnalyzer(ArrayList<Butterfly> butterflies) {
        this.butterflies = butterflies;
        this.result = new HashMap<>();
    }

    /**
     * Analyzes the list of butterflies and returns how often which attribute occurs.
     * @param property Property after which can be filtered.
     */
    void analyze(String property) {

        if(property != null) {
            butterflies = returnButterfliesWithProperty(property);
        }

        for(Pattern pattern : Pattern.values()) {
            result.put(pattern.toString(), (int) butterflies.stream().filter(butterfly -> butterfly.getPattern()
                    .equals(pattern)).count());
        }
        for(Color color : Color.values()) {
            result.put(color.toString(), (int) butterflies.stream().filter(butterfly -> butterfly.getColor()
                    .equals(color)).count());
        }
        for(Feelers feelers : Feelers.values()) {
            result.put(feelers.toString(), (int) butterflies.stream().filter(butterfly -> butterfly.getFeelers()
                    .equals(feelers)).count());
        }

        printResult();
    }

    /**
     * Returns a list of butterflies which all have a given property.
     * @param codedProperty Property which all should butterflies have.
     * @return List of butterflies with a specific property.
     */
    private ArrayList<Butterfly> returnButterfliesWithProperty(String codedProperty){

        ArrayList<Butterfly> butterfliesWithProperty = new ArrayList<>();
        String[] decodedProperty = codedProperty.split("-", 0);
        String property = decodedProperty[0];
        String propertyValue = decodedProperty[1];

        switch (property) {
            case "PATTERN":
                butterflies.forEach(butterfly -> {
                    if (butterfly.getPattern().toString().equals(propertyValue)) {
                        butterfliesWithProperty.add(butterfly);
                    }
                });
                break;
            case "COLOR":
                butterflies.forEach(butterfly -> {
                    if (butterfly.getColor().toString().equals(propertyValue)) {
                        butterfliesWithProperty.add(butterfly);
                    }
                });
                break;
            case "FEELERS":
                butterflies.forEach(butterfly -> {
                    if (butterfly.getFeelers().toString().equals(propertyValue)) {
                        butterfliesWithProperty.add(butterfly);
                    }
                });
                break;
        }
        return butterfliesWithProperty;
    }

    /**
     * Prints the result of the analysis.
     */
    private void printResult(){

        System.out.format(
                "No pattern: %d, black spots: %d, black stripes: %d%n",
                result.get("NO_PATTERN"), result.get("BLACK_SPOTS"), result.get("BLACK_STRIPES")
        );

        System.out.format(
                "red: %d, yellow: %d, green: %d, blue: %d%n",
                result.get("RED"), result.get("YELLOW"), result.get("GREEN"), result.get("BLUE")
        );

        System.out.format(
                "straight: %d, bent: %d%n%n",
                result.get("STRAIGHT"), result.get("BENT")
        );
    }
}