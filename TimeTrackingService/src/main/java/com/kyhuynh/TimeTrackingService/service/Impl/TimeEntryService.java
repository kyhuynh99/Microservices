package com.kyhuynh.TimeTrackingService.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyhuynh.TimeTrackingService.model.TimeEntry;
import com.kyhuynh.TimeTrackingService.repository.TimeEntryRepository;
import com.kyhuynh.TimeTrackingService.service.ITimeEntryService;

@Service
public class TimeEntryService implements ITimeEntryService {

    @Autowired
    private TimeEntryRepository timeEntryRepository;

    @Override
    public TimeEntry getTimeEntryById(String id) {
        return timeEntryRepository.findById(id).orElse(null);
    }

    @Override
    public List<TimeEntry> getAllTimeEntries() {
        return timeEntryRepository.findAll();
    }

    @Override
    public TimeEntry createTimeEntry(TimeEntry event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTimeEntry'");
    }

}
