package posttest4;

public class customer {
    protected String nama;
    protected String jenislaun;
    protected String alamat;
    protected String tanggal;
    
    public customer(String nama,String jenislaun, String alamat, String tanggal){
    this.nama = nama;
    this.jenislaun = jenislaun;
    this.alamat = alamat;
    this.tanggal = tanggal;
    }
    
    protected void setnama(String nama){
        this.nama = nama;
    }
    protected void setjenislaun(String jenislaun){
        this.jenislaun = jenislaun;
    }
    protected void setalamat(String alamat){
        this.alamat = alamat;
    }
    protected void settanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    protected String getnama(){
        return this.nama;
    }
    protected String getjenislaun(){
        return this.jenislaun;
    }
    protected String getalamat(){
        return this.alamat;
    }
    protected String gettanggal(){
        return this.tanggal;
    }
    
    public void hasil(){
        System.out.println("Nama\t\t:"+getnama());
        System.out.println("Jenis Laundry\t:"+getjenislaun());
        System.out.println("Alamat\t\t:"+getalamat());
        System.out.println("Tanggal\t\t: "+gettanggal());
    
    }
    
    public void panggil(String nama, String jenislaun, String alamat, String tanggal){
    setnama(nama);
    setjenislaun(jenislaun);
    setalamat(alamat);
    settanggal(tanggal);
    }  
    
    void databenar(){
    System.out.println("Data Customer benar");
    }
    void datasalah(){
    System.out.println("Data Customer Salah");
    }
    

}