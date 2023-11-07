package com.kyhuynh.CalendarService;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kyhuynh.CalendarService.model.Event;
import com.kyhuynh.CalendarService.repository.EventRepository;

@Component
public class MockDataLoader implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void run(String... args) throws Exception {

        if (eventRepository.count() == 0) {
            Event event1 = new Event();
            event1.setEventId("event1");
            event1.setTitle("Team Meeting");
            event1.setDescription("Weekly team meeting");
            event1.setStartTime(LocalDateTime.of(2023, 11, 15, 10, 0));
            event1.setEndTime(LocalDateTime.of(2023, 11, 15, 11, 0));
            eventRepository.save(event1);

            Event event2 = new Event();
            event2.setEventId("event2");
            event2.setTitle("Project Kickoff");
            event2.setDescription("Project kickoff meeting");
            event2.setStartTime(LocalDateTime.of(2023, 11, 16, 9, 30));
            event2.setEndTime(LocalDateTime.of(2023, 11, 16, 11, 30));
            eventRepository.save(event2);
        }

    }

}
