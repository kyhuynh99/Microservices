package com.kyhuynh.TimeTrackingService.service;

import java.util.List;

import com.kyhuynh.TimeTrackingService.model.TimeEntry;

public interface ITimeEntryService {

    TimeEntry getTimeEntryById(String id);

    List<TimeEntry> getAllTimeEntries();

    TimeEntry createTimeEntry(TimeEntry event);

}
