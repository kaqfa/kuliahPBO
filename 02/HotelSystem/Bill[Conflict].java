/**
 * Write a description of class Bill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bill
{
    private int total;
    private String transaction[];
    private int transFee[];
    private int transNum;
    
    public Bill(){
        transNum = 0;
        transaction = new String [10];
        transFee = new int[10];
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
    
    public void addTransaction(String trans, int fee){
        transaction[transNum] = trans;
        transFee[transNum] = fee;
        transNum++;
    }
}