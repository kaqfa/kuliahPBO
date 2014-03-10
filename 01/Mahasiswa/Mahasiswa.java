
/**
 * Write a description of class Mahasiswa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mahasiswa
{
    String nim;
    String nama;
    String email;
    int semester;
    double ipk;
    
    Mahasiswa (){
    
    }
    
    Mahasiswa(String nimInput, String namaInput, String emailInput, int semInput, double ipkInput){
        nim = nimInput;
        nama = namaInput;
        email = emailInput;
        semester = semInput;
        ipk = ipkInput;
    }
    
    String getNim(){
        return nim;
    }

    String getNama(){
        return nama;
    }
    
    String getEmail(){
        return email;
    }
    
    int getSemester(){
        return semester;
    }
    
    double getIpk(){
        return ipk;
    }
    
    void setNim(String nimInput){
        nim = nimInput;
    }
    
    void setNama(String namaInput){
        nama = namaInput;
    }
    
    void setEmail(String emailInput){
        email = emailInput;
    }
    
    void setSemester(int semInput){
        semester = semInput;
    }
    
    void setIpk(double ipkInput){
        ipk = ipkInput;
    }
    
    void statusMhs(){
        if(ipk < 1){
            System.out.println("Belum jadi mahasiswa");
        } else if(ipk < 2){
            System.out.println("IPK NASAKOM");
        } else if(ipk < 3){
            System.out.println("Mahasiswa kurang beruntung");
        } else if(ipk < 3.5){
            System.out.println("Sudah cukup");
        } else {
            System.out.println("Summa Cumlaude");
        }
    }
}