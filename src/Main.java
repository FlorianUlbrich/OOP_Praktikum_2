import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main method which uses commandline input to feed the analyzer with production data.
 */
public class Main {

    public static void main(String[] args) {

        boolean hasMoreToAnalyze = true;
        String property = null;

        while(hasMoreToAnalyze) {
            ArrayList<Butterfly> parents = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            for(int i = 0; i < 2; i++) {
                System.out.format("Please enter properties for the butterfly %d.\n" + "Please enter the pattern.\n", i+1);
                while(!scanner.hasNext("(NO_PATTERN)|(BLACK_STRIPES)|(BLACK_SPOTS)")) {
                    System.out.println("Valid patterns are: NO_PATTERN, BLACK_STRIPES, BLACK_SPOTS");
                    scanner.next();
                }
                String pattern = scanner.next();

                System.out.println("PLease enter the color");
                while(!scanner.hasNext("(RED)|(YELLOW)|(GREEN)|(BLUE)")) {
                    System.out.println("Valid patterns are: RED, YELLOW, GREEN, BLUE");
                    scanner.next();
                }
                String color = scanner.next();

                System.out.println("Please enter the type of feelers");
                while(!scanner.hasNext("(STRAIGHT)|(BENT)")) {
                    System.out.println("Valid patterns are: STRAIGHT, BENT");
                    scanner.next();
                }
                String feelers = scanner.next();

                parents.add(new Butterfly(Pattern.valueOf(pattern), Color.valueOf(color), Feelers.valueOf(feelers)));
            }

            System.out.println("Do you want to filter the results after a property? yes/no");
            while(!scanner.hasNext("(no)|(yes)")) {
                System.out.println("Please decide with no or yes");
                scanner.next();
            }
            if(scanner.hasNext("yes")) {
                System.out.println("Please enter the property in the following format: PROPERTY-PROPERTYVALUE");
                while(!scanner.hasNext("(PATTERN-NO_PATTERN)|(PATTERN-BLACK_SPOTS)|(PATTERN-BLACK_STRIPES)|" +
                        "(COLOR-RED)|(COLOR-YELLOW)|(COLOR-GREEN)|(COLOR-BLUE)|(FEELERS-STRAIGHT)|(FEELERS-BENT)")) {
                    System.out.println("Please enter a valid property and value");
                    scanner.next();
                }
                property = scanner.next();
            }

            // Random random = new Random();
            // int amount of eggs = random.next(1000) + 1000;

            ButterflyGenerator butterflyGenerator = new ButterflyGenerator(parents, 50);
            ButterflyAnalyzer butterflyAnalyzer = new ButterflyAnalyzer(butterflyGenerator.generateButterfliesFromParents());
            if(property != null) {
                butterflyAnalyzer.analyze(property);
            } else {
                butterflyAnalyzer.analyze(null);
            }

            // reset property
            property = null;

            System.out.println("Do you want to continue with another analysis? yes/no");
            String dummy = scanner.next();
            while(!scanner.hasNext("(no)|(yes)")) {
                System.out.println("Please decide with no or yes");
                scanner.next();
            }
            if(scanner.hasNext("no")) hasMoreToAnalyze = false;
        }
    }
}