
package utama;

public class Hewan extends MakhluqHidup {

    private int JumlahKaki;
    private String jenisMakanan;
    public int getJumlahKaki() {
        return JumlahKaki;
    }
    public void setJumlahKaki(int JumlahKaki) {
        this.JumlahKaki = JumlahKaki;
    }
    public void berjalan() {
        System.out.println("bisa Berjalan");
    }
    public String getJenisMakanan() {
        return jenisMakanan;
    }
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
}
