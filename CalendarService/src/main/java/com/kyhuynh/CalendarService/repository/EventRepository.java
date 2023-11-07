package com.kyhuynh.CalendarService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kyhuynh.CalendarService.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {

}
