import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = TaskManager.loadFileToList();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option: ");
            System.out.println("1. add");
            System.out.println("2. remove");
            System.out.println("3. list");
            System.out.println("4. exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                     tasks.add(TaskManager.addTask(tasks.size()));
                    break;
                case 2:
                    System.out.println("removed");
                    break;
                case 3:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(tasks.get(i).toString());

                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }
}