package com.todo.task_service.Service.impl;


import com.todo.task_service.Entity.Task;
import com.todo.task_service.Repository.TaskRepo;
import com.todo.task_service.Service.interfaces.TaskService;
import com.todo.task_service.dto.TaskReqDto;
import com.todo.task_service.dto.TaskResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.JspTemplateAvailabilityProvider;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {
    private TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public TaskResDto createTask(TaskReqDto taskReqDto) {
        log.info("Received the request fro controller");
        Task task =Task.builder()
                .title(taskReqDto.getTitle())
                .description(taskReqDto.getDescription())
                .build();
        Task savedTask=taskRepo.save(task);
        TaskResDto taskResDto=new TaskResDto(
                savedTask.getId(),savedTask.getTitle(),savedTask.getDescription());
        log.info("Task Saved Response {}", taskResDto);
        return taskResDto;
    }
}
