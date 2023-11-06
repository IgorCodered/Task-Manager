import java.util.Scanner;

public class Menu
{


    public static void displayMainMenu() {
        System.out.println("Привет, для выбора просто введи нужное число из меню! \n ");
        System.out.println("1. Добавить новую задачу");
        System.out.println("2. Посмотр задач по статусам");
        System.out.println("3. Выход из приложения.");
    }


    public static void displayAddTask() {
        System.out.println("Ты можешь добавить новую задачу.");
        System.out.println("Или можешь создать одну большую задачу она называется \"Эпик\".");
        System.out.println("1. Добавить новую задачу.");
        System.out.println("2. Добавить подзадачу в Эпик.");
        System.out.println("3. Создать \"Эпик\"");
        System.out.println("4. Выход в главное меню");
    }


    public static void displayAddTaskMan() {
        System.out.println("Введите название вашей задачи:");
    }

    public static void displayStatusTask() {
        System.out.println("1. Показать мои активные задачи");
        System.out.println("2. Показать мои новые задачи");
        System.out.println("3. Показать мои завершенные задачи");
        System.out.println("4. Вывести список активных и новых задач");
        System.out.println("5. Выход в главное меню");
    }
    public static void displayCompleteAddTask() {
        System.out.println("Прекрасно, ты добавил новую задачу!");
    }
    private static int selectMenu() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
    private void switchMainMenu() { //TODO Доделать кейсы
        int select = Menu.selectMenu();
        switch (select) {
            case 1
        }
    }
}
