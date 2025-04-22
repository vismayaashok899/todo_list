package com.todo.task_service.Repository;

import com.todo.task_service.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {
}
