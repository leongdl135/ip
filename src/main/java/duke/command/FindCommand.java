package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;

import java.util.ArrayList;

public class FindCommand extends Command {

    private String keyWord;

    public FindCommand(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public void execute(Ui ui, Storage storage, TaskList taskList) throws DukeException {
        ArrayList<Task> temp = new ArrayList<Task>();
        for (Task task: taskList.getTaskList()) {
            if (task.toString().contains(keyWord)) {
                temp.add(task);
            }
        }
        ui.displayMatchingList(temp);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
