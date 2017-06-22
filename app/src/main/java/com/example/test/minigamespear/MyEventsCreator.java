package com.example.test.minigamespear;

/**
 * Created by Андрей on 22.06.2017.
 */

public interface MyEventsCreator {
    void makeEvent(String myEventMessage);
    void addListener(MyEventsListener listener);
    void removeListener(MyEventsListener listener);
}
