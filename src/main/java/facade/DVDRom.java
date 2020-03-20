package facade;

public class DVDRom {
    private  boolean data = false;
    public boolean hashData(){
        return data;
    }

    public void load(){
        data =true;
    }
    public void unload(){
        data = false;
    }
}
