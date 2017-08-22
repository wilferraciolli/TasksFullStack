package com.wiltech.service;

import com.wiltech.domain.Task;
import com.wiltech.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * The type Task service.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    /**
     * Instantiates a new Task service.
     *
     * @param taskRepository the task repository
     */
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
