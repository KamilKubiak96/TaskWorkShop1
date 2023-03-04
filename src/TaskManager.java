import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    static String FILE_NAME = "tasks.csv";
    static String[] options = {"add", "remove,", "list", "exit"};

    static String[][] tasks;

    public static void printOptions(String[] tab) {
        System.out.println(Color.BLUE);
        System.out.println("Please select an option: " + Color.BLUE);
        for (String option : tab) {
            System.out.println(option);
        }


    }

    public static List<Task> loadFileToList() {

        List<Task> tasks = new ArrayList<>();
        File file = new File("/home/kamil/untitled1/src/05_attachment_Zasoby do projektu.pl/tasks.csv");

        try (Scanner scanner = new Scanner(file)) {
            int i = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(", ");
                String description = array[0];
                String date = array[1];
                boolean isItImportant = Boolean.parseBoolean(array[2]);
                Task task = new Task(i, description, date, isItImportant);
                tasks.add(task);
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return tasks;

    }

    public static Task addTask(int ID) {
        Scanner description = new Scanner(System.in);
        System.out.println("Wpisz opis");
        String line = description.nextLine();
        Scanner data = new Scanner(System.in);
        System.out.println("Podaj date");
        String line1 = data.nextLine();
        Scanner isItImportant = new Scanner(System.in);
        System.out.println("Czy jest ważne");
        String line2 = isItImportant.nextLine();
        Task task = new Task(ID, line, line1, Boolean.parseBoolean(line2));
        return task;
    }
}

