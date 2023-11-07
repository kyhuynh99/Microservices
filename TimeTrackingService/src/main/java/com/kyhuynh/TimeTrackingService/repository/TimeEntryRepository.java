package com.kyhuynh.TimeTrackingService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kyhuynh.TimeTrackingService.model.TimeEntry;

public interface TimeEntryRepository extends MongoRepository<TimeEntry, String> {

}
