public class Epic extends Task implements EpicInterface
{
    private String name;
    private int taskStatus;

    public Epic(String name) {
        super(name);
    }

    public Epic(String name, TaskStatus status) {
        super(name);
    }

    @Override
    public void deleteAllTask() {

    }

    @Override
    public void printAllEpicTask() {

    }

    @Override
    public void completeAllEpicTask() {

    }

    @Override
    public Epic createEpic() {
        return null;
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
