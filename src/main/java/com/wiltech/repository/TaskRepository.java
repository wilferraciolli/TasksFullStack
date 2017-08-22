package com.wiltech.repository;

import com.wiltech.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Task repository.
 */
@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {

}
