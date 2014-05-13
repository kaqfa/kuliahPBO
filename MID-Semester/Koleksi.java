public class Koleksi
{
    String judul;
    String penulis;
    String penerbit;
    int jumlah;
    
    Koleksi(String judul, String penulis,String penerbit,int jml){
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jumlah = jml;
    }
    
    public void laporan(){
        System.out.println(this.judul+" ("+this.penulis+" - "+this.penerbit+") ["+this.jumlah+"]");
    }
}