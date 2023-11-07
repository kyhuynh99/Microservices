package com.kyhuynh.TimeTrackingService.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "time_entries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeEntry {

    @Id
    private String id;
    private String activityName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String eventId; // Field to store the event or activity ID

}
