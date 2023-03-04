import java.util.Date;

public class Task {
    private int id;
    private String description;

    private String date;

    private boolean isItImportant;

    public Task(int id, String description, String date, boolean isItImportant) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.isItImportant = isItImportant;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", isItImportant=" + isItImportant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isItImportant() {
        return isItImportant;
    }

    public void setItImportant(boolean itImportant) {
        isItImportant = itImportant;
    }
}
