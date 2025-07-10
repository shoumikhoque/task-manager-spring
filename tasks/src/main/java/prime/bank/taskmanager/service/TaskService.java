package prime.bank.taskmanager.service;

import org.springframework.stereotype.Service;
import prime.bank.taskmanager.dto.Task;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    int seqId = 1;
    List allTasks=new ArrayList();
    public List<Task> getAllTasks() {
        return allTasks;
    }
    public void saveTask(Task task) {
        task.setId(seqId);
        allTasks.add(task);
        seqId++;

    }
    public void deleteTask(int seqId) {
        allTasks.remove(seqId-1);
    }
}
