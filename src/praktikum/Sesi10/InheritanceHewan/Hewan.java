package praktikum.Sesi10.InheritanceHewan;

public class Hewan {
    protected String suara;

        public Hewan(){
            this.suara = "Suara";
        }

        public void cetak(){
            System.out.println("Hewan Bersuara" + suara);
        }
    }
class Mamalia extends Hewan{
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak = "beranak";
    }
    public void cetak(){
        System.out.println("Mamalia Berkembang biak" + berkembangbiak);
    }
}

class Sapi extends Mamalia{
    private String nama;
    private String umur;

    public Sapi(){
        suara = "Hemoh...";
        berkembangbiak = "beranak";
        this.nama = "Sopi";
        this.umur = "1";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Mamalia Sapi =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Berkembang Biak : " + berkembangbiak);
           System.out.println("Nama             : " + nama);
            System.out.println("Umur              : " + umur + " Tahun");
    }
}
class Kambing extends Mamalia{
    private String nama;
    private String umur;

    public Kambing(){
        suara = "Embek...";
        berkembangbiak = "Beranak";
        this.nama = "Si Ling";
        this.umur = "2";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Mamalia Kambing =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Berkembang Biak : " + berkembangbiak);
           System.out.println("Nama             : " + nama);
            System.out.println("Umur              : " + umur + " Tahun");
    }
}

class Unggas extends Hewan{
    protected String berkembangbiak;

    public Unggas(){
        this.berkembangbiak = "Bertelur";
    }

    public void cetak(){
        System.out.println("Bertelur");
    }
}

class Burung extends Unggas{
    private String jenis;
    private String ciri;

        public Burung(){
            suara = "Mbekur....";
            berkembangbiak = "Bertelur";
            this.jenis = "Merpati";
            this.ciri = "Bulu Putih";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Unggas Burung =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Berkembang Biak : " + berkembangbiak);
           System.out.println("Nama             : " + jenis);
            System.out.println("Ciri              : " + ciri);
    }
}

class Ayam extends Unggas{
    private String jenis;
    private String ciri;

        public Ayam(){
            suara = "Petok-Petok....";
            berkembangbiak = "Bertelur";
            this.jenis = "Ayam Kampung";
            this.ciri = "Bulu Bercorak Putih Hitam";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Unggas Ayam =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Berkembang Biak : " + berkembangbiak);
           System.out.println("Nama             : " + jenis);
            System.out.println("Ciri              : " + ciri);
    }
}

class Ikan extends Hewan{
    protected String napas;

    public Ikan(){
        this.napas = "Insang";
    }

    public void cetak(){
        System.out.println("Insang");
    }
}

class Gurami extends Ikan{
    private String ciri;
    private String berat;

        public Gurami(){
            suara = "-----";
            napas = "Insang";
            this.ciri = "Berwarna Hitam";
            this.berat = "2";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Ikan Gurami =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Bernapas        : " + napas);
           System.out.println("Ciri             : " + ciri);
            System.out.println("Berat              : " + berat + "Kg");
    }
}

class Lele extends Ikan{
    private String ciri;
    private String berat;

        public Lele(){
            suara = "-----";
            napas = "Insang";
            this.ciri = "Berwarna Hitam Keputihan";
            this.berat = "3";
    }

    public void cetak(){
        System.out.println("======== Data Hewan Ikan Gurami =========");
         System.out.println("Suara          : " + suara);
          System.out.println("Bernapas        : " + napas);
           System.out.println("Ciri             : " + ciri);
            System.out.println("Berat              : " + berat + "Kg");
    }
}

class Pewarisan{
    public static void main(String[] args) {
        Sapi spi = new Sapi();
        spi.cetak();
                System.out.println("");

        Kambing kmb1 = new Kambing();
        kmb1.cetak();
                System.out.println("");

        Burung brg1 = new Burung();
        brg1.cetak();
                System.out.println("");

        Ayam aym1 = new Ayam();
        aym1.cetak();
                System.out.println("");

        Gurami grm1 = new Gurami();
        grm1.cetak();
                System.out.println("");

        Lele ll1 = new Lele();
        ll1.cetak();
    }
}