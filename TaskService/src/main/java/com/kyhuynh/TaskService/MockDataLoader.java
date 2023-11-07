package com.kyhuynh.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kyhuynh.TaskService.model.Task;
import com.kyhuynh.TaskService.model.TaskStatus;
import com.kyhuynh.TaskService.repository.TaskRepository;

@Component
public class MockDataLoader implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository; // Your TaskRepository

    @Override
    public void run(String... args) throws Exception {
        if (taskRepository.count() == 0) {
            Task task1 = new Task();
            task1.setTitle("Complete project proposal");
            task1.setDescription("Create a detailed project proposal document.");
            task1.setDueDate("2023-11-20");
            task1.setStatus(TaskStatus.PENDING);
            taskRepository.save(task1);

            Task task2 = new Task();
            task2.setTitle("Prepare presentation");
            task2.setDescription("Prepare a presentation for the team meeting.");
            task2.setDueDate("2023-11-22");
            task2.setStatus(TaskStatus.IN_PROGRESS);
            taskRepository.save(task2);

        }
    }
}
