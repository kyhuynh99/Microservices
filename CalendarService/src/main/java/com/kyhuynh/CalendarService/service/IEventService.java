package com.kyhuynh.CalendarService.service;

import java.util.List;

import com.kyhuynh.CalendarService.model.Event;

public interface IEventService {

    Event getEventById(String id);

    List<Event> getAllEvents();

    Event createEvent(Event event);

}
