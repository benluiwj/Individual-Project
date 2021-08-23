/**
 * Command class that handles user commands. 
 */
public abstract class Command {

    Command() { }

    /**
     * Function for the children of the command class to implement when a command is executed.
     * @param tasks the list of tasks that Duke has
     * @param ui the UI components available
     * @param storage the location to write the file back to (if necessary)
     */
    abstract void execute(TaskList tasks, Ui ui, Storage storage);

    /**
     * Returns a boolean to indicate whether the command allows Duke to exit.
     * @return a boolean indicating whether Duke can exit
     */
    boolean isExit() {
        return false;
    }
}
