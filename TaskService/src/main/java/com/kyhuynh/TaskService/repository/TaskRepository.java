package com.kyhuynh.TaskService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kyhuynh.TaskService.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

}
