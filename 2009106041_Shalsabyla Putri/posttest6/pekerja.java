package posttest6;

public class pekerja extends customer {
    
    public pekerja(String nama, String jenislaun, String alamat, String tanggal) {
        super(nama, jenislaun, alamat, tanggal);
    }
    @Override
    public void hasil(){
        System.out.println("Nama Pekerja\t\t:"+getnama());
        System.out.println("Jenis Pekerjaan\t\t:"+getjenislaun());
        System.out.println("Alamat Pekerja\t\t:"+getalamat());
        System.out.println("Tanggal Masuk\t\t: "+gettanggal());
    
    }
    public void hasil(String keterangan){
        System.out.println("Nama Pekerja\t\t:"+getnama());
        System.out.println("Jenis Pekerjaan\t\t:"+getjenislaun());
        System.out.println("Alamat Pekerja\t\t:"+getalamat());
        System.out.println("Tanggal Masuk\t\t: "+gettanggal());
        System.out.println("Status Pekerja\t\t:"+keterangan);
    
    }
}
