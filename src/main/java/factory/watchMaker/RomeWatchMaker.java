package factory.watchMaker;

import factory.watch.Watch;
import factory.watch.RomeWatch;

public class RomeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new RomeWatch();
    }
}
