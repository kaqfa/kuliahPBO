
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String [] args){
        Mahasiswa mhsTemp;
        KelompokMatkul kelBaru = new KelompokMatkul("A11.4408", "PBO");
        
        mhsTemp = new Mahasiswa("A123","Fahri","fahri@gmail.com",14,3.0);
        kelBaru.setKomting(mhsTemp);
        
        mhsTemp = new Mahasiswa("A2345", "Dika", "dika@gmail.com", 10, 2.9);        
        kelBaru.inputMhs(mhsTemp);
        mhsTemp = new Mahasiswa("A7899", "Dian Agung", "agung@gmail.com", 20, 1.9);        
        kelBaru.inputMhs(mhsTemp);
        mhsTemp = new Mahasiswa("A3456", "Martha Tilaar", "martha@gmail.com", 6, 3.0);        
        kelBaru.inputMhs(mhsTemp);
        mhsTemp = new Mahasiswa("A4567", "Anis", "anis@gmail.com", 10, 3.9);        
        kelBaru.inputMhs(mhsTemp);
        mhsTemp = new Mahasiswa("A5678", "Rika", "rika@gmail.com", 6, 3.3);        
        kelBaru.inputMhs(mhsTemp);
        
        kelBaru.printAllMhs();
    }
}
