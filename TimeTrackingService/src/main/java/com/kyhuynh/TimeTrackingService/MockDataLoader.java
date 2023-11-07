package com.kyhuynh.TimeTrackingService;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kyhuynh.TimeTrackingService.model.TimeEntry;
import com.kyhuynh.TimeTrackingService.repository.TimeEntryRepository;

@Component
public class MockDataLoader implements CommandLineRunner {

    @Autowired
    private TimeEntryRepository timeEntryRepository; // Your TimeEntryRepository

    @Override
    public void run(String... args) throws Exception {
        if (timeEntryRepository.count() == 0) {
            TimeEntry timeEntry1 = new TimeEntry();
            timeEntry1.setActivityName("Meeting");
            timeEntry1.setStartTime(LocalDateTime.of(2023, 11, 15, 10, 0));
            timeEntry1.setEndTime(LocalDateTime.of(2023, 11, 15, 11, 0));
            timeEntry1.setEventId("event1"); // Associate with event1
            timeEntryRepository.save(timeEntry1);

            TimeEntry timeEntry2 = new TimeEntry();
            timeEntry2.setActivityName("Development");
            timeEntry2.setStartTime(LocalDateTime.of(2023, 11, 16, 14, 30));
            timeEntry2.setEndTime(LocalDateTime.of(2023, 11, 16, 17, 30));
            timeEntry2.setEventId("event2"); // Associate with event2
            timeEntryRepository.save(timeEntry2);
        }
    }

}
