import java.util.ArrayList;
import java.util.List;

public class actions {

private List<String> list = new ArrayList<>();

public void addOptions(String option){
    list.add(option);
}
public class taskManager{
    static final String fileName = "tasks.csv";
    static final String[] options = {"add", "remove" , "list", "exit"};

    static String[][] tasks;
}
}
