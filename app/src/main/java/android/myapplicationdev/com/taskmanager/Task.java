package android.myapplicationdev.com.taskmanager;

import java.io.Serializable;

/**
 * Created by 15017569 on 5/25/2017.
 */
public class Task implements Serializable {
    private int id;
    private String taskName;
    private String description;

    public Task(int id, String taskName, String description) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
