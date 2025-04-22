package com.todo.task_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResDto {
    private int id;
    private String title;
    private String description;
}
