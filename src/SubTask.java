public class SubTask extends Task implements TaskInterface
{
    public SubTask(String name) {
        super(name);
    }

    public SubTask(String name, TaskStatus status) {
        super(name);
    }
}
