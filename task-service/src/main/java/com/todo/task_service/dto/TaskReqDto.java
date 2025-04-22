package com.todo.task_service.dto;

import lombok.Builder;
import lombok.Data;

@Data

public class TaskReqDto {
    private String title;
    private String description;
}
