package facade;

public class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    SSD ssd = new SSD();


    void copy() {
        power.on();
        dvdRom.load();
        ssd.copyFromDVD(dvdRom);
    }
}

