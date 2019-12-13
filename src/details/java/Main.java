package day1.java;
import day1.java.ReadInput;

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
        errorCheckArguments(args);

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
        ArrayList<String> parts = new ArrayList<>(
            Arrays.asList(textField.getText().split("\n")));
    }

    /**
     * Ensures arguments supplied are in the format as desired. Stops program and supplies information on how to
     * adjust arguments if incorrect.
     *
     * @param args The arguments as supplied by the user.
     */
    private static void errorCheckArguments(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Please provide argument as specified below:\n " +
                    "Arg1: relative class path to input file.\n ");
            System.exit(0);
        }
    }
}