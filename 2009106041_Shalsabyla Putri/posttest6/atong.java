package posttest6;

public class atong implements pakaian {
    static String nama = "atong";
    String namaOrderan, jenisPakaian, Status;
    int beratPakaian;
    int hargaPakaian;
    
    public atong(String namaOrderan, String jenisPakaian, String Status, int hargaPakaian){
        this.namaOrderan = namaOrderan;
        this.jenisPakaian = jenisPakaian;
        this.Status = Status;
        this.hargaPakaian = hargaPakaian; 
    
    }

    @Override
    public void orderan1() {
        System.out.println(" Nama Orderan\t\t: " +this.namaOrderan);
        System.out.println(" Jenis Pakaian\t\t: " +this.jenisPakaian);
        System.out.println(" Status Pelanggan\t: " +this.Status);
        System.out.println(" Harga Pakaian\t\t: " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan2() {
        System.out.println(" Nama Orderan\t\t: " +this.namaOrderan);
        System.out.println(" Jenis Pakaian\t\t: " +this.jenisPakaian);
        System.out.println(" Status Pelanggan\t: " +this.Status);
        System.out.println(" Harga Pakaian\t\t: " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan3() {
        System.out.println(" Nama Orderan\t\t: " +this.namaOrderan);
        System.out.println(" Jenis Pakaian\t\t: " +this.jenisPakaian);
        System.out.println(" Status Pelanggan\t: " +this.Status);
        System.out.println(" Harga Pakaian\t\t: " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan4() {
        System.out.println(" Nama Orderan\t\t: " +this.namaOrderan);
        System.out.println(" Jenis Pakaian\t\t: " +this.jenisPakaian);
        System.out.println(" Status Pelanggan\t: " +this.Status);
        System.out.println(" Harga Pakaian\t\t: " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }
    
}
