public class SubTask extends Task implements TaskInterface
{
    public SubTask() {
        SubTask now = new SubTask();
        now.setTaskStatus(TaskStatus.NEW.ordinal());
        System.out.println("Строка тест 2");
    }

    public SubTask(String name, int taskStatus) {
        super(name, taskStatus);
    }
}
