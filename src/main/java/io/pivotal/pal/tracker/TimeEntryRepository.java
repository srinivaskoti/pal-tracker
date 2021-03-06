package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntryToCreate);

    TimeEntry find(long timeEntryId);

    List<TimeEntry> list();

    TimeEntry update(long eq, TimeEntry any);

    void delete(long timeEntryId);
}
