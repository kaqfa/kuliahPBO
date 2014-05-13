import java.util.*;

/**
 * Write a description of class Bill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bill
{
    private int total;
    private ArrayList <String> transaction;
    private ArrayList <Integer> transFee;
    public static final double PPN = 0.1; // konstan, tidak dapat dirubah
    
    public Bill(){
        transaction = new ArrayList<String>();
        transFee = new ArrayList<Integer>();
    }
    
    public static double hitungPajak(int harga){
        return harga + (PPN * harga);
    }
    
    public void resetBill(){
        transaction.clear();
        transFee.clear();
        total = 0;
        System.out.println("Billing telah direset");
    }
    
    public void addTransaction(String trans, int fee){
        transaction.add(trans);
        transFee.add(fee);
    }
    
    public int countTotal(){
        total = 0;
        int jmlTransaction = transaction.size();
        for(int i = 0; i < jmlTransaction; i++){
            total += transFee.get(i);
        }
        return total;
    }
    
    public void printBill(){
        int jmlTransaction = transaction.size();
        System.out.println("Transaksi yang dilakukan:");
        for(int i = 0; i < jmlTransaction; i++){
            System.out.println(transaction.get(i)+" harga : "+transFee.get(i));
        }
        System.out.println("Total : "+countTotal());
    }
}