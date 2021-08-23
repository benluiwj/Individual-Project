import duke.command.Command;
import duke.parser.Parser;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoneCommandTester {
    Ui ui;
    Storage storage;
    TaskList taskList;

    DoneCommandTester() {
        this.ui = new Ui();
        this.storage = new Storage("DoneCommandTest.txt");
        try {
            taskList = storage.load();
        } catch (Exception e) {
            taskList = new TaskList();
        }
    }

    void executeCommand(String command) {
        Command c = new Parser().parse(command);
        c.execute(taskList, ui, storage);
    }

    @Test
    void testDoneCommandWhenNothingInList() {
        executeCommand("done 1");
        assertEquals(taskList.size(), 0);
    }

    @Test
    void testDoneCommand() {
        executeCommand("todo read books");
        executeCommand("done 1");
        assertEquals(taskList.getAllTasks().get(0).getStatusIcon(), "X");
    }
}
