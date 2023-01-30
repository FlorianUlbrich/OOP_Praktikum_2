import java.util.ArrayList;
import java.util.Random;

/**
 * Generates a list of a given number of butterfly children for two given parents.
 */
class ButterflyGenerator {

    /**
     * Number of how many butterflies will be generated.
     */
    private int amountOfEggs;

    /**
     * Male butterfly.
     */
    private Butterfly male;

    /**
     * Female butterfly.
     */
    private Butterfly female;

    /**
     * Result list of the butterfly children.
     */
    private ArrayList<Butterfly> butterflies = new ArrayList<>();

    /**
     * Random generator.
     */
    private Random random;

    /**
     * Constructor.
     * @param parents Parent butterflies.
     * @param amountOfEggs Amount of children
     */
    ButterflyGenerator(ArrayList<Butterfly> parents, int amountOfEggs) {
        this.amountOfEggs = amountOfEggs;
        this.male = parents.get(0);
        this.female = parents.get(1);
        this.random = new Random();
    }

    /**
     * Generator function which will randomly create a list of butterfly children with properties randomly inherited
     * from the parents.
     * @return List of butterfly children.
     */
    ArrayList<Butterfly> generateButterfliesFromParents() {
        for(int i = 0; i < amountOfEggs; i++) {
            Pattern pattern = random.nextInt(2) % 2 == 0 ? male.getPattern() : female.getPattern();
            Color color = random.nextInt(2) % 2 == 0 ? male.getColor() : female.getColor();
            Feelers feelers = random.nextInt(2) % 2 == 0 ? male.getFeelers() : female.getFeelers();
            butterflies.add(new Butterfly(pattern, color, feelers));
        }
        return butterflies;
    }
}