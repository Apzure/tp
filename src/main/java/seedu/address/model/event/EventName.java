package seedu.address.model.event;

import static java.util.Objects.requireNonNull;

public class EventName {
    public final String eventName;

    public EventName(String eventName) {
        requireNonNull(eventName);
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return eventName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof EventName)) {
            return false;
        }

        EventName otherName = (EventName) other;
        return eventName.equals(otherName.eventName);
    }

    @Override
    public int hashCode() {
        return eventName.hashCode();
    }
}
