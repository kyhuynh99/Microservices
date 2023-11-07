package com.kyhuynh.TimeTrackingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyhuynh.TimeTrackingService.model.TimeEntry;
import com.kyhuynh.TimeTrackingService.service.Impl.TimeEntryService;

@RestController
@RequestMapping("/api/v1/time-entries")
public class TimeEntryController {

    @Autowired
    private TimeEntryService timeEntryService;

    @GetMapping
    public ResponseEntity<List<TimeEntry>> getTimeEntries() {
        return ResponseEntity.ok(timeEntryService.getAllTimeEntries());
    }

}
