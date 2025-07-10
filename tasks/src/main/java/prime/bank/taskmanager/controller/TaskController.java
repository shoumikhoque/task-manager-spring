package prime.bank.taskmanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prime.bank.taskmanager.dto.Task;
import prime.bank.taskmanager.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    private List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping
    private ResponseEntity<String> saveTask(Task task) {
        taskService.saveTask(task);
        return ResponseEntity.ok("Task has been saved successfully");
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<String>  deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok("Task with id: "+id+" has been deleted successfully");
    }
}
