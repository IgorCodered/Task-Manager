import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task implements TaskInterface
{
    private String name;
    private int count = 0;
    ArrayList<Task> taskList = new ArrayList<>();


    public Task(String name) {
        this.name = name;
    }

    public Task(String name, TaskStatus status) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    @Override
    public void addTask() {
        Menu.displayAddTask();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        TaskStatus taskStatus = TaskStatus.NEW;
        Task newTask = new Task(name, taskStatus);
        taskList.add(newTask);
        Menu.displayCompleteAddTask();

    }

    @Override
    public void addSubTask() {

    }

    @Override
    public void removeTask() {

    }

    @Override
    public void completeTask() {

    }

    @Override
    public void taskChangeStatus() {

    }
}
