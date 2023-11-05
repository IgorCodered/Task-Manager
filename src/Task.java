public class Task implements TaskInterface
{
    private String name;
    private int taskStatus;

    public Task() {
    }

    public Task(String name, int taskStatus) {
        this.name = name;
        this.taskStatus = taskStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public void addTask() {

    }

    @Override
    public void removeTask() {

    }

    @Override
    public void completeTask() {

    }
}
