package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * The ListCommand that helps the user list the tasks.
 *
 * @author Leong Jia Hao Daniel
 */
public class ListCommand extends Command {

    /**
     * Executes the list command.
     *
     * @param ui The ui class which handles the user interface.
     * @param storage The storage class which deals with the file.
     * @param taskList The tasklist that stores the tasks.
     * @throws DukeException throws if there is an error.
     */
    @Override
    public void execute(Ui ui, Storage storage, TaskList taskList) throws DukeException {
        ui.displayList(taskList.getTaskList());
    }

    /**
     * Returns true if the command is an ExitCommand.
     *
     * @return false.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
