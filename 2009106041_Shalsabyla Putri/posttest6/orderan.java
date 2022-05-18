package posttest6;

/**
 *
 * @author Asus
 */
public class orderan implements pakaian {
    String namaOrderan, jenisPakaian;
    int beratPakaian;
    int hargaPakaian;
    
    public orderan(String namaOrderan, String jenisPakaian, int hargaPakaian){
        this.namaOrderan = namaOrderan;
        this.jenisPakaian = jenisPakaian;
        this.hargaPakaian = hargaPakaian; 
    
    }

    

    @Override
    public void orderan1() {
        System.out.println(" Nama Orderan : " +this.namaOrderan);
        System.out.println(" Jenis Pakaian : " +this.jenisPakaian);
        System.out.println(" Harga Pakaian : " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan2() {
        System.out.println(" Nama Orderan : " +this.namaOrderan);
        System.out.println(" Jenis Pakaian : " +this.jenisPakaian);
        System.out.println(" Harga Pakaian : " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan3() {
        System.out.println(" Nama Orderan : " +this.namaOrderan);
        System.out.println(" Jenis Pakaian : " +this.jenisPakaian);
        System.out.println(" Harga Pakaian : " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    @Override
    public void orderan4() {
        System.out.println(" Nama Orderan : " +this.namaOrderan);
        System.out.println(" Jenis Pakaian : " +this.jenisPakaian);
        System.out.println(" Harga Pakaian : " +this.hargaPakaian);
        System.out.println(" ------------------------------------ ");
    }

    
}
