/**
 * Write a description of class Bill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bill
{
    private int total;
    private String transaction[] = new String [10];
    private int transFee[] = new int[10];
    private int transNum;
    
    public Bill(){
        transNum = 0;
    }
    
    public void resetBill(){
        total = 0;
        transNum = 0;
        System.out.println("Billing telah direset");
    }
    
    public void addTransaction(String trans, int fee){
        transaction[transNum] = trans;
        transFee[transNum] = fee;
        transNum++;
    }
    
    public int countTotal(){
        for(int i = 0; i < transNum; i++){
            total += transFee[i];
        }
        return total;
    }
    
    public void printBill(){
        System.out.println("Transaksi yang dilakukan:");
        for(int i = 0; i < transNum; i++){
            System.out.println(transaction[i]+" harga : "+transFee[i]);
        }
        System.out.println("Total : "+countTotal());
    }
}