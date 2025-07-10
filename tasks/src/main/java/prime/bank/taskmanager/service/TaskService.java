package prime.bank.taskmanager.service;

import org.springframework.stereotype.Service;
import prime.bank.taskmanager.dto.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    int seqId = 1;
    Map<Integer, Task> allTasks = new HashMap<>();

    public List<Task> getAllTasks() {
        return allTasks.values().stream().toList();
    }
    public void saveTask(Task task) {
        task.setId(seqId);
        allTasks.put(seqId,task);
        seqId++;
    }
    public void deleteTask(int seqId) {
        allTasks.remove(seqId);
    }
}
