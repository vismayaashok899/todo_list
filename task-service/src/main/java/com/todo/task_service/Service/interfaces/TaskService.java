package com.todo.task_service.Service.interfaces;


import com.todo.task_service.Entity.Task;
import com.todo.task_service.dto.TaskReqDto;
import com.todo.task_service.dto.TaskResDto;

public interface TaskService {

    public TaskResDto createTask(TaskReqDto taskReqDto);
}
