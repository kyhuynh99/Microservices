package com.kyhuynh.TaskService.service;

import java.util.List;

import com.kyhuynh.TaskService.model.Task;

public interface ITaskService {

    Task getTaskById(String id);

    List<Task> getAllTasks();

    Task createTask(Task Task);

}
