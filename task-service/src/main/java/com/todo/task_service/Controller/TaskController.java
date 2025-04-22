package com.todo.task_service.Controller;

import com.todo.task_service.Service.interfaces.TaskService;
import com.todo.task_service.constants.Endpoint;
import com.todo.task_service.dto.TaskReqDto;
import com.todo.task_service.dto.TaskResDto;
import com.todo.task_service.pojo.TaskReq;
import com.todo.task_service.pojo.TaskRes;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Endpoint.V1_TASK)
@Slf4j
public class TaskController {
    private TaskService taskService;
    private ModelMapper modelMapper;

    public TaskController(TaskService taskService, ModelMapper modelMapper) {
        this.taskService = taskService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public void createTask(@RequestBody TaskReq taskReq)
    {
        log.info("Task Request Received :{}",taskReq);
        TaskReqDto taskReqDto = modelMapper.map(taskReq, TaskReqDto.class);
        TaskResDto taskResDto = taskService.createTask(taskReqDto);
        TaskRes taskRes = modelMapper.map(taskResDto,TaskRes.class);
    }








}
