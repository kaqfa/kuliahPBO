package component;

/**
 * Write a description of class Service here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Service implements Transaction
{
    private String serviceName;
    private int fee;
    
    public Service(String serviceName, int fee){
        this.serviceName = serviceName;
        this.fee = fee;
    }
    
    public String transactionName(){
        return serviceName;
    }
    
    public int getPrice(){
        return fee;
    }
    
    public String description(){
        return "Nama Servis: "+serviceName+"\n"+
                "Harga: "+fee;
    }
}
