package factory.watchMaker;

import factory.watch.Watch;
import factory.watch.DigitalWatch;

public class DigitalWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
