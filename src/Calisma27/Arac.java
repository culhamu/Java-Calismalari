package Calisma27;

public class Arac {
    private String plaka;
    private String isim;
    private String soyisim;
    private String aracMarkasi;
    private String adres;
    private String aracDurumu;


    public Arac() {
    }

    public Arac(String plaka, String isim, String soyisim, String aracMarkasi, String adres, String aracDurumu) {
        this.plaka = plaka;
        this.isim = isim;
        this.soyisim = soyisim;
        this.aracMarkasi = aracMarkasi;
        this.adres = adres;
        this.aracDurumu = aracDurumu;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setAracMarkasi(String aracMarkasi) {
        this.aracMarkasi = aracMarkasi;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setAracDurumu(String aracDurumu) {
        this.aracDurumu = aracDurumu;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getAracMarkasi() {
        return aracMarkasi;
    }

    public String getAdres() {
        return adres;
    }

    public String getAracDurumu() {
        return aracDurumu;
    }

    @Override
    public String toString() {
        return "Arac\n" +
                "plaka=" + plaka + "\n" +
                " isim=" + isim + "\n" +
                " soyisim=" + soyisim + "\n" +
                " aracMarkasi=" + aracMarkasi + "\n" +
                " adres=" + adres + "\n" +
                " aracDurumu=" + aracDurumu + "\n"
                ;
    }
}
