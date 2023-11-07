package com.kyhuynh.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kyhuynh.UserService.model.User;
import com.kyhuynh.UserService.repository.UserRepository;

@Component
public class MockDataInitializer implements CommandLineRunner {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public MockDataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Generate and insert dummy data
        User user1 = new User("1", "John Doe", "john@example.com");
        User user2 = new User("2", "Jane Smith", "jane@example.com");
        User user3 = new User("3", "David Johnson", "david@example.com");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

}
