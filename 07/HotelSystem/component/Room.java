package component;


/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room implements Transaction
{
    private String roomNo;
    private int roomClass;
    private String facilities;
    private int status;
    private int dayUsed;
    
    public static final String classChoice [] = 
                {"No Class", "VIP Class", "First Class", "Second Class"};
    
    public Room(String roomNo, int roomClass){
        this.roomNo = roomNo;
        setRoomClass(roomClass);
        status = 0;
        dayUsed = 0;
    }
    
    public void checkIn(int days){
        if(status == 0){
            dayUsed = days;
            status = 1;
        } else {
            System.out.println("Kamar sedang terpakai");
        }
    }
    
    public void checkOut(){
        if(status == 1){
            status = 0;
            dayUsed = 0;
        } else {
            System.out.println("Kamar kosong kok, yang checkout siapa?");
        }
    }
    
    public void setRoomClass(int newRoomClass){
        if(newRoomClass < 3 || newRoomClass > 1){
            roomClass = newRoomClass;
            if(roomClass == 3){
                facilities = "Single Bed + AC";
            } else if(roomClass == 2){
                facilities = "Double Bed + AC";
            } else if(roomClass == 1){
                facilities = "Double Bed + AC + Bathub";
            }
            //System.out.println("Inputan kelas kamar berhasil");
        } else {
            System.out.println("Inputan kelas salah");
        }
    }
    
    public int getPrice(){
        if(roomClass == 3){
            return 500000;
        } else if(roomClass == 2){
            return 1000000;
        } else if(roomClass == 1){
            return 1500000;
        } else {
            return 0;
        }
    }
    
    public String transactionName(){
        return "Menginap di kamar nomor "+roomNo+" selama "+dayUsed+" hari";
    }        
    
    public String description(){
        return "Kamar nomor: "+roomNo+"\n"+
                "Termasuk kelas: "+roomClass+"\n"+
                "Memiliki fasilitas: "+facilities+"\n"+
                "Saat ini "+printStatus();
    }
    
    public String printStatus(){
        if(status == 1)
            return "Kamar sedang terpakai";
        else   
            return "Kamar kosong";
    }
}