
/**
 * Write a description of class KelompokMatkul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KelompokMatkul
{
    private String kodeKelompok;
    private String matkul; // Class Matkul
    private int jmlMhs = 0;
    private Mahasiswa komting;
    private Mahasiswa mhs[] = new Mahasiswa[40];
    
    KelompokMatkul(String kodeKelompok, String matkul){
        this.kodeKelompok = kodeKelompok;
        this.matkul = matkul;
    }
    
    public void setKomting(Mahasiswa mhsKomting){
        komting = mhsKomting;
    }
    
    public void inputMhs(Mahasiswa mhsInput){
        mhs[jmlMhs] = mhsInput;
        jmlMhs++;
    }
    
    public void printAllMhs(){
        komting.printIdentitas();
        
        int i;        
        for(i = 0; i < jmlMhs; i++){
            mhs[i].printIdentitas();
        }
    }
}
