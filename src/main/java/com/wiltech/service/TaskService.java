package com.wiltech.service;

import com.wiltech.domain.Task;

/**
 * The interface Task service.
 */
public interface TaskService {

    /**
     * List iterable.
     *
     * @return the iterable
     */
    Iterable<Task> list();

    /**
     * Save task.
     *
     * @param task the task
     * @return the task
     */
    Task save(Task task);
}
