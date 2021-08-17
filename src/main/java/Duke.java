import java.util.Scanner;

/**
 * Duke class contains the main method that takes
 * in inputs.
 */
public class Duke {
    /**
     * Main method for the Duke class.
     * @params the inputs from the user.
     */
    public static void main(String[] args) {
        Response response = new Response();
        System.out.println("Hello! I'm Duke\n" + "What can I do for you?\n");
        Scanner inputs = new Scanner(System.in);
        while (inputs.hasNext()) {
            System.out.println(response.output(inputs.nextLine()));
        }
        inputs.close();
    }
}
