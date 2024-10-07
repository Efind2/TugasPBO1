## Pembuatan Inharitence Java 
Hallo Semua 👋
Project ini saya lakukan untuk memenuhi tugas mata kuliah Peograman Berorientasi Objek, saya mencoba untuk mengimplementasikan inhariten atau pewarisan disini saya menggunakan studi kasus makhluk hidup atau yang menjadi super classnya yang memeiliki keturunan(sub class) hewan dan tumbuhan, kemudian hewan memiliki keturunan atau subclass amfibi, aves, ikan, reptil, mamalia, dan tumbuhan memiliki keturunan atau sub class dikotil dan manakotil.
Disetiap sub class saya telah membuat method yang diambil dari super clasnya maupun method yang hanya khusus berada di sub class tersebut.
## Aplikasi
- IDE NetBeans
## Kode di Super Class MakhluqHidup

    public class MakhluqHidup {
      public  void bernafas(){
      System.out.println("bisa Bernafas");
    
      }
      public  void tumbuh(){
      System.out.println("bisa Tumbuh");
    
      }public  void berkembangbiak(){
      System.out.println("bisa berkembangbiak");
     }
      private String caraReproduksi;

    /**
     * @return the caraReproduksi
     */
      public String getCaraReproduksi() {
        return caraReproduksi;
      }

    /**
     * @param caraReproduksi the caraReproduksi to set
     */
      public void setCaraReproduksi(String caraReproduksi) {
        this.caraReproduksi = caraReproduksi;
      }   
      }
method yang ada di sini bisa diturun kan ke sub class dari makhluq hidup, tanpa harus membuat method lagi di sebclassnya.

## Kode di Main Class
    public class PertemuanSatu {

    public static void main(String[] args) {
        Aves bebek = new Aves();
        System.out.println("ini bebek");
        bebek.berjalan();
        bebek.bernafas(); 
        bebek.setJumlahKaki(2);
        bebek.setJenisMakanan("Omnivora");
        bebek.setCaraReproduksi("bertelur");
        bebek.setBentukParuh("datar");
        bebek.setCaraTerbang("tidak bisa terbang");
        System.out.println("jenis yang dimakan " + bebek.getJenisMakanan());
        System.out.println("reproduksi  " + bebek.getCaraReproduksi());
        System.out.println("jumlah kaki  " + bebek.getJumlahKaki());
        System.out.println("dengan paruh  " + bebek.getBentukParuh());
        System.out.println("bisa " + bebek.getCaraTerbang());
        System.out.println();
        Mamalia macan = new Mamalia();
        System.out.println("ini macan");
        macan.berjalan();
        macan.bernafas(); 
        macan.setJumlahKaki(4);
        macan.setJenisMakanan("Karniivora");
        macan.setCaraReproduksi("Melahirkan");
        macan.menyusui();
        System.out.println("mempunyai kaki" + macan.getJumlahKaki());
        System.out.println("jenis makanan " + macan.getJenisMakanan());
        System.out.println("repsrduksi  " + macan.getCaraReproduksi());
        System.out.println();
        Ikan lele = new Ikan();
        System.out.println("ini lele");
        lele.berjalan();
        lele.berkembangbiak();
        lele.tumbuh();
        lele.hidupDIAir();
        lele.setCaraReproduksi("bertelur");
        lele.setJumlahKaki(0);
        lele.setJenisMakanan("Omnivora");
        lele.setCaraberenang("dengan sirip dan tubuh");
        lele.setJenisAir("air tawar");
        lele.setJenisSirip("caudal fin");
        lele.setJumlahInsang(8);
        System.out.println("reproduksi "+ lele.getCaraReproduksi());
        System.out.println("tidak memiliki kaki jadi jumlah kaki "+ lele.getJumlahKaki() );
        System.out.println("termasuk "+ lele.getJenisMakanan());
        System.out.println("bisa berenang "+ lele.getCaraberenang());
        System.out.println("hidup di "+ lele.getJenisAir());
        System.out.println("memiliki sirip dengan jenis " + lele.getJenisSirip());
        System.out.println("memiliki jumlah insang "+ lele.getJumlahInsang());
        System.out.println();
        Reptil buaya = new Reptil();
        System.out.println("ini buaya");
        buaya.berjalan();
        buaya.berkembangbiak();
        buaya.bernafas();
        buaya.setJumlahKaki(4);
        buaya.setCaraReproduksi("bertelur");
        buaya.setJenisSisik("scutes");
        buaya.setJenisMakanan("karnivora");
        System.out.println("jumlah kaki  " + buaya.getJumlahKaki());
        System.out.println("reproduksi  " + buaya.getCaraReproduksi());
        System.out.println("jenis sisik " + buaya.getJenisSisik());
        System.out.println("jenis makanan  "+ buaya.getJenisMakanan());
        
        Amfibi katak = new Amfibi();
        System.out.println("ini katak");
        katak.berjalan();
        katak.berkembangbiak();
        katak.bernafas();
        katak.hidupDuaAlam();
        katak.setJumlahKaki(4);
        katak.setJenisMakanan("karnivora ");
        katak.setCaraReproduksi("bertelur ");
        System.out.println("memiliki kaki "+ katak.getJumlahKaki());
        System.out.println("jenis makanan " + katak.getJenisMakanan());
        System.out.println("reproduksi " + katak.getCaraReproduksi());
        
        System.out.println();
        System.out.println("ini pisang");
        Monokotil pisang = new Monokotil();
        pisang.berkembangbiak();
        pisang.bernafas();
        pisang.setArahDaun("ke bawah");
        pisang.setBentukAkar("serabut");
        pisang.setCaraReproduksi("pembuahan");
        pisang.setJenisDaun("lembaran");
        pisang.setJumlahMahkotaBunga(3);
        pisang.setStrukturBatang("pseudostem");
        pisang.setWarnaDaun("hijau");
        pisang.satuBiji();
        System.out.println("Arah daun  " + pisang.getArahDaun());
        System.out.println("bentuk akar  " + pisang.getBentukAkar());
        System.out.println("jumlah mahkota bungga "+ pisang.getJumlahMahkotaBunga());
        System.out.println("struktur bungga "+ pisang.getStrukturBatang());
        System.out.println("warna daun "+ pisang.getWarnaDaun());
        System.out.println("jenis daun " + pisang.getJenisDaun());
        System.out.println("cara reproduksi " + pisang.getCaraReproduksi());
        
        System.out.println();
        System.out.println("ini mawar");
        Dikotil mawar = new Dikotil();
        mawar.berkembangbiak();
        mawar.bernafas();
        mawar.duaBiji();
        mawar.setArahDaun("ke arah batang");
        mawar.setBentukAkar("serabut");
        mawar.setCaraReproduksi("biji");
        mawar.setJenisDaun("majemuk");
        mawar.setJumlahMahkotaBunga(5);
        mawar.setStrukturBatang("pseudostem");
        mawar.setWarnaDaun("hijau");
        System.out.println("arah daun "+ mawar.getArahDaun());
        System.out.println("bentuk akar " + mawar.getBentukAkar());
        System.out.println("cara reproduksi "+ mawar.getCaraReproduksi());
        System.out.println("jenis daun " + mawar.getJenisDaun());
        System.out.println("jumlah mahkota bunga "+ mawar.getJumlahMahkotaBunga());
        System.out.println("struktur batang " + mawar.getStrukturBatang());
        System.out.println("warna daun " + mawar.getWarnaDaun());
    }
    
    }
pada kode tersebut saya mencoba memanggil semua method pada subclass untuk mengetahui fungsi pewarisan.
Cukup itu yang dapat saya jelaskan semoga mudah dipahami 😁




    



