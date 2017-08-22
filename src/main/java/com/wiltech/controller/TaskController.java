package com.wiltech.controller;

import com.wiltech.domain.Task;
import com.wiltech.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * The type Task controller.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

//    private final Logger log = LoggerFactory.getLogger(TaskController.class);
    private TaskService taskService;

    /**
     * Instantiates a new Task controller.
     *
     * @param taskService the task service
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * List tasks iterable.
     *
     * @return the iterable
     */
    @GetMapping( value = {"","/"})
    public Iterable<Task> listTasks() {
        return taskService.list();
    }

//    @PostMapping( "/save" )
//    public Task saveTask(@RequestBody Task task) {
//        return taskService.save(task);
//    }
}
