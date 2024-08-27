package utama;
public class Ikan extends Hewan {
    public void hidupDIAir() {
        System.out.println("Saya hidup di air");
    }
    private String jenisSirip;
    private String caraberenang;
    private int jumlahInsang;
    private String jenisAir;
    public String getJenisSirip() {
        return jenisSirip;
    }
    public void setJenisSirip(String jenisSirip) {
        this.jenisSirip = jenisSirip;
    }
    public String getCaraberenang() {
        return caraberenang;
    }

    public void setCaraberenang(String caraberenang) {
        this.caraberenang = caraberenang;
    }
    public int getJumlahInsang() {
        return jumlahInsang;
    }
    public void setJumlahInsang(int jumlahInsang) {
        this.jumlahInsang = jumlahInsang;
    }
    public String getJenisAir() {
        return jenisAir;
    }
    public void setJenisAir(String jenisAir) {
        this.jenisAir = jenisAir;
    }

}
