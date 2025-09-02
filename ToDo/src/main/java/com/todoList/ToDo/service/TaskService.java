package com.todoList.ToDo.service;

import com.todoList.ToDo.models.Tasks;
import com.todoList.ToDo.repository.TaskRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();

    }

    public void createTask(String title) {
        Tasks task = new Tasks();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Tasks task = taskRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Task ID"));

        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }
}
