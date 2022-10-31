import java.util.Objects;

public class Task {
    private final int value;
    private final int value2;

    public Task(int value, int value2) {
        this.value = value;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (value == task.value && value2 == task.value2)
                    || (value == task.value2 && value2 == task.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value * value2);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ?", this.value, this.value2);
    }
}
