import java.util.*;
/**
 * Write a description of class Hotel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel2
{
   private ArrayList <Room> rooms = new ArrayList<Room>();
    private ArrayList <Service> servs = new ArrayList<Service>();
    private Bill tagihan = new Bill();
    
    public Hotel2(){
        roomsRegister();
        servicesRegister();
    }
        
    public void runner(){        
        rooms.get(3).checkIn(2);
        tagihan.addTransaction(rooms.get(3).transactionName(), rooms.get(3).getPrice());
        tagihan.addTransaction(servs.get(0).transactionName(), servs.get(0).getPrice());
        rooms.get(3).checkOut();
        tagihan.printBill();
    }        
    
    public void roomsRegister(){
        rooms.add(new Room("A01", 1));
        rooms.add(new Room("A02", 1));
        rooms.add(new Room("A03", 1));
        rooms.add(new Room("B01", 2));
        rooms.add(new Room("B02", 2));
        rooms.add(new Room("B03", 2));
        rooms.add(new Room("B04", 2));
        rooms.add(new Room("B05", 2));
        rooms.add(new Room("C01", 3));
        rooms.add(new Room("C02", 3));
    }
    
    public void servicesRegister(){
        servs.add(new Service("Laundry", 20000));
        servs.add(new Service("Snack", 20000));
        servs.add(new Service("Dinner", 20000));
        servs.add(new Service("Breakfast", 20000));
        servs.add(new Service("WiFi", 20000));
    }
}
