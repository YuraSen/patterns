package facade;

public class SSD {
    public void copyFromDVD(DVDRom dvd){
        if(dvd.hashData()){
            System.out.println("Copy data from disc");
        }
        else {
            System.out.println("Disc is empty");
        }
    }
}
