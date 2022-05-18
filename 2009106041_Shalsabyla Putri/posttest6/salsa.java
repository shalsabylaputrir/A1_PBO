package posttest6;

public class salsa extends customer {
    
    public salsa(String nama, String jenislaun, String alamat, String tanggal) {
        super(nama, jenislaun, alamat, tanggal);
    }
    @Override
    public void hasil(){
        System.out.println("Nama Customer\t\t:"+getnama());
        System.out.println("Jenis Laundry\t\t:"+getjenislaun());
        System.out.println("Alamat Customer\t\t:"+getalamat());
        System.out.println("Tanggal Masuk\t\t: "+gettanggal());
    
    }
    public void hasil(String keterangan){
        System.out.println("Nama Customer\t\t:"+getnama());
        System.out.println("Jenis Laundry\t\t:"+getjenislaun());
        System.out.println("Alamat Customer\t\t:"+getalamat());
        System.out.println("Tanggal Masuk\t\t: "+gettanggal());
        System.out.println("Ket Laundry\t\t:"+keterangan);
    
    }
    
}
