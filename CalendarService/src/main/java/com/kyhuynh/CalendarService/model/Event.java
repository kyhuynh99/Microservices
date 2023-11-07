package com.kyhuynh.CalendarService.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    private String eventId;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
