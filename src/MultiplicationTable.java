import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<Task> tasks = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(10),
                    random.nextInt(10)) );
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Задачи: ").append('\n');
        for (Task task : this.tasks) {
            stringBuilder.append(task).append('\n');
        }
        return stringBuilder.toString();
    }
}
