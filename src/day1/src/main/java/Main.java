import java.util.ArrayList;
import java.util.Arrays;

/**
 * Runnable class providing entry point to day1.
 */
public class Main {

    /**
     * Creates a game with the specified seed and number of iterations to run.
     *
     * @param args String array arguments provided with the run command.
     */
    public static void main(String[] args) {
        System.out.println("Calculating...\n");

        // Game game = new Game(args[0], getIntegerFromStringArgument(args[1]));
    }

    /**
     * Obtains the module masses to enable computation
     * 
     * @param fileLocation
     * @return array of module masses
     */
    private static String obtainModuleMasses(String fileLocation) {
        ReadInput input = new ReadInput(fileLocation);
        String returnedInput = input.getContent();
        return returnedInput;
//        ArrayList<String> parts = new ArrayList<>(
//            Arrays.asList(returnedInput.getText().split("\n")));
    }
}