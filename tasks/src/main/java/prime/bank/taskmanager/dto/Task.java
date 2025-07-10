package prime.bank.taskmanager.dto;

import prime.bank.taskmanager.TaskStatus;

import java.io.Serializable;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String description;
    private TaskStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
