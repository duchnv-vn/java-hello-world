package section_17.exercise_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {

    public static List<Task> makeToDoList() {
        String[] taskInputs = { "Complete assignment", "Go for a run", "Buy groceries" };

        var tasks = new ArrayList<Task>();
        for (var input : taskInputs) {
            var newTask = new Task(input);

            if (input.equals("Go for a run")) {
                newTask.setCompleted(true);
            }
            tasks.add(newTask);
        }

        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println(task);
        }

        return tasks;
    }

}
