package com.kyhuynh.TaskService.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyhuynh.TaskService.model.Task;
import com.kyhuynh.TaskService.repository.TaskRepository;
import com.kyhuynh.TaskService.service.ITaskService;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getTaskById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task createTask(Task Task) {
        throw new UnsupportedOperationException("Unimplemented method 'createTask'");
    }

}
