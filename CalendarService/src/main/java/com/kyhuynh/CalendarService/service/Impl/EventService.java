package com.kyhuynh.CalendarService.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyhuynh.CalendarService.model.Event;
import com.kyhuynh.CalendarService.repository.EventRepository;
import com.kyhuynh.CalendarService.service.IEventService;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event getEventById(String id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event createEvent(Event event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEvent'");
    }

}
